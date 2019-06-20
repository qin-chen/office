package com.qfedu.controller;

import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/19.
 */
@Controller
public class LoginLogController {

    @Autowired
    private LoginLogService loginLogService;


    @RequestMapping("/loginloglist.do")
    @ResponseBody
    public Map<String,Object> findAllLoginLog(Integer page, Integer limit){
        Map<String,Object> map = loginLogService.findByPage(page,limit);
        System.out.println(map+"++++++++++++");
        return map;
    }

}
