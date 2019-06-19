package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.pojo.Tcheck;
import com.qfedu.pojo.User;
import com.qfedu.service.TcheckService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
@Controller
public class TcheckController {
    @Autowired
    private TcheckService tcheckService;
    @RequestMapping("/processlist.do")
    @ResponseBody
    public Map<String,Object> list(Integer page, Integer limit,HttpServletRequest request){
        request.getSession().getAttribute("user666");
        User user = (User) request.getSession().getAttribute("user666");
        String no = user.getNo();
        /*String no = "qf000001";*/

        PageHelper.startPage(page,limit);
        List<Tcheck> list = tcheckService.findAll(no);//查询所有数据
        long total = ((Page)list).getTotal();//总记录数
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);//总记录数，赋值
        map.put("data",list);//查询所有数据，赋值
        return map;
    }
    @RequestMapping("/processdel.do")
    @ResponseBody
    public JsonBean update(Integer id){
        Integer flag = 4;
        tcheckService.updateById(id,flag);
        return new JsonBean(1000,null);
    }
    @RequestMapping("/processecharts.do")
    @ResponseBody
    public Tcheck selectById(Integer id){
        Tcheck tcheck = tcheckService.selectById(id);
        return tcheck;
    }
    @RequestMapping("/processupdate.do")
    @ResponseBody
    public JsonBean update(Integer id,Integer flag){
        tcheckService.updateById(id,flag);
        return new JsonBean(1000,null);
    }
    @RequestMapping("/processnolist.do")
    @ResponseBody
    public Map<String,Object> list02(Integer page, Integer limit,HttpServletRequest request){
        PageHelper.startPage(page,limit);

        request.getSession().getAttribute("user666");
        User user = (User) request.getSession().getAttribute("user666");
        List<Tcheck> list = tcheckService.findAllById(user.getNo());//查询所有数据

        /*String manger="qf000001";
        List<Tcheck> list = tcheckService.findAllById(manger);//查询所有数据*/

        long total = ((Page)list).getTotal();//总记录数
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);//总记录数，赋值
        map.put("data",list);//查询所有数据，赋值
        return map;
    }
    @RequestMapping("/processadd.do")
    public String addByTcheck(Tcheck tcheck,HttpServletRequest request){
        request.getSession().getAttribute("user666");
        User user = (User) request.getSession().getAttribute("user666");
        tcheck.setStartname(user.getName());
        tcheck.setStartno(user.getNo());

        /*tcheck.setStartname("张三");
        tcheck.setStartno("qf000001");*/

        tcheck.setPid("31118");
        tcheck.setFlag(1);
        tcheckService.addByTcheck(tcheck);
        //return new JsonBean(1000,null);
        return "redirect:/processlist.html";
    }
}