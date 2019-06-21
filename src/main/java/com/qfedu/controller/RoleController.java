package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;
import com.qfedu.service.RoleService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2019/6/20 0020.
 */
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/userall.do")
    public Map<String,Object> list(Integer page, Integer limit,User user){
        System.out.println("#$&*"+user);
        PageHelper.startPage(page,limit);
        List<User> list = roleService.findAll(user);//查询所有数据
        System.out.println("******"+list);
        long total = ((Page)list).getTotal();//总记录数
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);//总记录数，赋值
        map.put("data",list);//查询所有数据，赋值
        return map;
    }
    @RequestMapping("/userdel.do")
    public JsonBean userdel01(Integer id){
        roleService.userdelById01(id);
        return new JsonBean(1000,null);
    }
    @RequestMapping("/roleall.do")
    public List<Role> roleall01(){
        List<Role> roleList = roleService.findAllRole();
        return roleList;
    }
    @RequestMapping("/userroleedit.do")
    public JsonBean userroleedit(Integer id, String rids){
        roleService.userroleedit(id,rids);
        return new JsonBean(1000,null);
    }
}