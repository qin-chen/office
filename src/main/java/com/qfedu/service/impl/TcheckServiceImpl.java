package com.qfedu.service.impl;

import com.qfedu.dao.TcheckDao;
import com.qfedu.pojo.Tcheck;
import com.qfedu.service.TcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
@Service
public class TcheckServiceImpl implements TcheckService {
    @Autowired
    private TcheckDao tcheckDao;

    @Override
    public List<Tcheck> findAll(String no) {
        return tcheckDao.findAll(no);
    }

    @Override
    public Tcheck selectById(Integer id) {
        return tcheckDao.selectById(id);
    }

    @Override
    public void updateById(Integer id, Integer flag) {
        tcheckDao.updateById(id,flag);
    }

    @Override
    public List<Tcheck> findAllById(String manger) {
        return tcheckDao.findAllById(manger);
    }

    @Override
    public void addByTcheck(Tcheck tcheck) {
        tcheckDao.addByTcheck(tcheck);
    }
}