package com.qfedu.controller;

import com.qfedu.pojo.Depart;
import com.qfedu.service.DepartService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/17.
 */

@Controller
@RequestMapping("/depart")
public class DepartController {
    @Autowired
    private DepartService departService;
    @RequestMapping("/departall.do")
    @ResponseBody
    public List<Depart> selectDepartName(){
        List<Depart> departList = departService.selectDepartName();
        return departList;
    }


    @RequestMapping("/departpage.do")
    @ResponseBody
    public Map<String ,Object> selectAll(Integer page ,Integer limit){
       Map<String ,Object> map =  departService.selectAll(page,limit);

        return map;
    }

   @RequestMapping("/departupdate.do")
    public String updateDepart(Depart depart){
       departService.updateDepart(depart);

       return "redirect:/departlist.html";
   }
  @RequestMapping("/departadd.do")
    public String addDepart(Depart depart){
      depart.setFlag(1);
      departService.addDepart(depart);
      return "redirect:/departlist.html";
  }
    @RequestMapping("/departdelete.do")
    @ResponseBody
    public JsonBean deleteDepart(Integer id){
        departService.deleteDepart(id);
        return new JsonBean(1000,null);
    }
}