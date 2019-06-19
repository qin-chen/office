package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 星尘 on 2019/6/14.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login.do")
    public JsonBean login (String no,String password,HttpServletRequest request){
        User user = userService.loginValidate(no, password);
        if (user !=null){
            request.getSession().setAttribute("user666",user);
            return new JsonBean(1,null);
          }
        return null;
    }

}