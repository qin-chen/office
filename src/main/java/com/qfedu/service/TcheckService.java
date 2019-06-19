package com.qfedu.service;

import com.qfedu.pojo.Tcheck;

import java.util.List;

/**
 * Created by Administrator on 2019/6/17 0017.
 */
public interface TcheckService {
    List<Tcheck> findAll(String no);

    Tcheck selectById(Integer id);

    void updateById(Integer id, Integer flag);

    List<Tcheck> findAllById(String manger);

    void addByTcheck(Tcheck tcheck);
}
