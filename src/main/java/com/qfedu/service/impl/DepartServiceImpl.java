package com.qfedu.service.impl;

import com.qfedu.dao.DepartDao;
import com.qfedu.pojo.Depart;
import com.qfedu.pojo.Staff;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}