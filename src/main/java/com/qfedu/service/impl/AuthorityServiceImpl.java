package com.qfedu.service.impl;

import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Winchester on 2019/6/19.
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityDao authorityDao;


    @Override
    public List<Authority> selectUsermenuById(Integer id) {
        return authorityDao.selectUsermenuById(id);
    }
}
