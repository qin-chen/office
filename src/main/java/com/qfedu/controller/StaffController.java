package com.qfedu.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.dao.StaffDao;
import com.qfedu.pojo.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.utils.ExcelUtils;
import com.qfedu.utils.UploadUtils;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/17.
 */
@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("/staffpage.do")
    @ResponseBody
    public Map<String,Object> select(Integer page ,Integer limit){
        Map<String, Object> map = staffService.selectAll(page, limit);
        return map;
    }

    @RequestMapping("/staffadd.do")
    public String  addStaff(Model model, Staff staff){
      //  if(staff != null){
          //  String no = staff.getNo();
           // Staff staff1 = staffService.selectStaffByNo(no);
           // if(staff1 !=null){
                staff.setFlag(1);
                staffService.addStaff(staff);
                return "redirect:/stafflist.html";
           // }else{
           //      model.addAttribute("msg","有重复");
           // }

       // }
      //  return null;
    }
     @RequestMapping("/staffupdate.do")
    public String updateStaff(Staff staff){
         staffService.updateStaff(staff);
         return "redirect:/stafflist.html";
     }

    @RequestMapping("/staffdelete.do")
    @ResponseBody
    public JsonBean delStaff(String no){
        staffService.delStaff(no);
        return new JsonBean(1000,null);
    }

    @RequestMapping("/photoupload.do")
    @ResponseBody
   public JsonBean uploadPhoto(MultipartFile file ){

            UploadUtils upload = new UploadUtils();
            String path = upload.getPath();
            String s = upload.upload(file); //
            String msg = path+"/"+s;
            return new JsonBean(1000,msg);
    }


    @RequestMapping("/staffbatch.do")
    public String staffbatch( MultipartFile mFile){

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
            List<Staff> staffList = objectMapper.readValue(jsonStr, new TypeReference<List<Staff>>() {});
            System.out.println(staffList+"+++++++++++");

            // 批量插入
            staffService.addStaffBatch(staffList);

        } catch (Exception e) {
            e.printStackTrace();
            //return new JsonBean(0, e.getMessage());
        }

        return "redirect:/stafflist.html";
    }
}