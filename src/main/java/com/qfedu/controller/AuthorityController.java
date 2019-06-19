package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.User;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Winchester on 2019/6/19.
 */
@Controller
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("/usermenu.do")
    @ResponseBody
    public List<Authority> selectUsermenuById(String id,HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user666");
        System.out.println(user);
        System.out.println(id+"---------");
        List<Authority> list = authorityService.selectUsermenuById(Integer.parseInt(id));
        return list;
    }

}
