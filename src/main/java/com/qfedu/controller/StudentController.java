package com.qfedu.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;
import com.qfedu.service.StudentService;
import com.qfedu.utils.ExcelUtils;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/14.
 */
@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查询学生列表
    @RequestMapping("/studentpage.do")
    @ResponseBody
    public Map<String, Object> findByPage(Integer page,Integer limit){
        Map<String,Object> map = studentService.findByPage(page,limit);
        return map;
    }

    //查询班级列表
    @RequestMapping("/gradeall.do")
    @ResponseBody
    public List<Grade> findGradeAll(){
        List<Grade> list = studentService.findGradeAll();
        System.out.println(list+"++++++++");
        return list;
    }

    //查询员工列表
    @RequestMapping("/staffall.do")
    @ResponseBody
    public List<Staff> findStaffAll(){
        List<Staff> list = studentService.findStaffAll();
        System.out.println(list+"___________");
        return list;
    }

    @RequestMapping("/studentadd.do")
    public String studentadd(Student student){
        System.out.println(student+"++++");
        student.setFlag(1);
        studentService.addStudent(student);
        return "redirect:/studentlist.html";
    }

    @RequestMapping("/studentbatch.do")
    public String studentbatch(@RequestParam MultipartFile mFile){

        // 获取上传文件的文件名
        String fileName = mFile.getOriginalFilename();
        // 获取上传文件的输入流
        try {
            InputStream inputStream = mFile.getInputStream();
            // 读取excel内容
            List<Map<String, Object>> maps = ExcelUtils.readExcel(fileName, inputStream);
            // 通过jackson进行操作
            ObjectMapper objectMapper = new ObjectMapper();
            // 将对象转为json格式字符串
            String jsonStr = objectMapper.writeValueAsString(maps);
            // 将json字符串转为指定类型的对象
            List<Student> stuList = objectMapper.readValue(jsonStr, new TypeReference<List<Student>>() {});
            System.out.println(stuList+"+++++++++++");

            // 批量插入
            studentService.addStus(stuList);

        } catch (Exception e) {
            e.printStackTrace();
            //return new JsonBean(0, e.getMessage());
        }

        return "redirect:/studentlist.html";
    }


}
