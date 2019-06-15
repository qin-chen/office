package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/coursepage.do")
    @ResponseBody
    public Map<String,Object> list(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Course> list = courseService.findAll();//查询所有数据
        long total = ((Page)list).getTotal();//总记录数
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);//总记录数，赋值
        map.put("data",list);//查询所有数据，赋值
        return map;
    }
    @RequestMapping("/courseupdate.do")
    public String update(Course course){
        courseService.updateByCourse(course);
        return "courselist";
    }
    @RequestMapping("/courseadd.do")
    public String insert(Course course){
        courseService.insertByCourse(course);
        return "courselist";
    }
    @RequestMapping("/coursedelete.do")
    @ResponseBody
    public JsonBean delete(Integer id){
        courseService.deleteById(id);
        return new JsonBean(1000,null);
    }
}