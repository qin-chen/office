package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao1;
import com.qfedu.pojo.Grade;
import com.qfedu.service.GradeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/18.
 */
@Service
public class GrandeServiceImpl1 implements GradeService1 {

    @Autowired
    private GradeDao1 gradeDao1;

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Grade> list = gradeDao1.findAllGrade();
        System.out.println(list+"++++++++");
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @Override
    public List<Grade> findGradeAll() {
        return gradeDao1.findGradeAll();
    }

}
