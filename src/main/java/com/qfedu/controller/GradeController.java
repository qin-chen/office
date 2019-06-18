package com.qfedu.controller;

import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/17.
 */
@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

    //分页查询
    @RequestMapping("/gradepage.do")
    @ResponseBody
    public Map<String,Object> findByPage(Integer page,Integer limit){
        Map<String,Object> map = gradeService.findByPage(page,limit);
        System.out.println(map+"------------------");
        return map;
    }

    //查询班级列表
    @RequestMapping("/gradeall.do")
    @ResponseBody
    public List<Grade> findGradeAll(){
        List<Grade> list = gradeService.findGradeAll();
        System.out.println(list+"++++++++");
        return list;
    }

}
