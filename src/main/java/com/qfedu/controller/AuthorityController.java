package com.qfedu.controller;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.User;
import com.qfedu.service.AuthorityService;
import com.qfedu.vo.JsonBean;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/authoritylist.do")
    @ResponseBody
    public Map<String,Object> authoritylist(Integer page,Integer limit){
        Map<String,Object> map = authorityService.findByPage(page,limit);
        return map;
    }

    @RequestMapping("/authorityadd.do")
    @ResponseBody
    public JsonBean authorityadd(Authority authority){
        authority.setType(1);
        System.out.println("--------"+authority+"+++++++++++");
        System.out.println(authority.getParentId()+"----------");
        authorityService.authorityadd(authority);
        return new JsonBean(1000,null);
    }

    @RequestMapping("/authorityroot.do")
    @ResponseBody
    public List<Authority> selectParentRoot(){
        Integer parentId = 0;
        List<Authority> list = authorityService.selectParentRoot(parentId);
        return list;
    }

    @RequestMapping("/authoritydelete.do")
    @ResponseBody
    public JsonBean authoritydelete(Integer id){
        System.out.println(id+"++++++");
        authorityService.deleteById(id);
        return new JsonBean(1000,null);
    }



}
