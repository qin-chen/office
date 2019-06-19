package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.vo.JsonBean;
import com.qiniu.util.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created by 星尘 on 2019/6/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login.do")
    @ResponseBody
    public JsonBean login (String no,String password,HttpServletRequest request){
        User user = userService.loginValidate(no, password);
        System.out.println(user.getId()+"++++++++");
        if (user !=null){
            request.getSession().setAttribute("user666",user);
            return new JsonBean(1,user);
          }
        return null;
    }

    @RequestMapping("/userloginout.do")
    public String logout(HttpServletRequest request){
        //清除session
        Enumeration<String> enumeration = request.getSession().getAttributeNames();
        while (enumeration.hasMoreElements()) {
           String key = enumeration.nextElement().toString();
             request.getSession().removeAttribute(key);
         }
        return "redirect:/login.html";

    }

}