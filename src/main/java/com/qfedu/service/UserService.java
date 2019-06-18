package com.qfedu.service;

import com.qfedu.pojo.User;

/**
 * Created by 星尘 on 2019/6/14.
 */
public interface UserService {
    public User loginValidate (String no , String password);
}
