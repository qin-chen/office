package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 星尘 on 2019/6/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
     @Override
    public User loginValidate(String no, String password) {
         User user = userDao.loginValidate(no, password);
         return user;
    }
}