package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.pojo.Staff;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 星尘 on 2019/6/17.
 */
@Service
public class DepartServiceImpl implements DepartService  {
    @Autowired
    private DepartDao departDao;
    @Override
    public List<Depart> selectDepartName() {
        List<Depart> departName = departDao.selectDepartName();
        return departName;
    }

    @Override
    public Map<String, Object> selectAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Depart> departList = departDao.selectAllDepart();
        long total = ((Page) departList).getTotal(); // 总记录
        int pages = ((Page) departList).getPages(); // 总页数
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",departList);
        map.put("msg","");
        map.put("count",total);
        return map;
    }

    @Override
    public void updateDepart(Depart depart) {
        departDao.updateDepart(depart);
    }

    @Override
    public void addDepart(Depart depart) {
        departDao.addDepart(depart);
    }

    @Override
    public void deleteDepart(Integer id) {
        departDao.deleteDepart(id);
    }
}