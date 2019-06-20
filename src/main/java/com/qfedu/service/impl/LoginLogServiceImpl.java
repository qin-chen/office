package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.LoginLogDao;
import com.qfedu.pojo.LoginLog;
import com.qfedu.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/19.
 */
@Service
public class LoginLogServiceImpl implements LoginLogService{

    @Autowired
    private LoginLogDao loginLogDao;


    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<LoginLog> list = loginLogDao.findAllLoginLog();
        long total = ((Page) list).getTotal();
        int pages = ((Page) list).getPages();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }
}
