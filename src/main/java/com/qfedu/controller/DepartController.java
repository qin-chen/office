package com.qfedu.controller;

import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 星尘 on 2019/6/17.
 */

@RestController
@RequestMapping("/depart")
public class DepartController {
    @Autowired
    private DepartService departService;
    @RequestMapping("/departall.do")
    public List<Depart> selectDepartName(){
        List<Depart> departList = departService.selectDepartName();
        return departList;
    }

}