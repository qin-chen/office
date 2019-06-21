package com.qfedu.dao;

import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public interface RoleDao {
    List<User> findAll(User user);

    void userdelById01(Integer id);

    List<Role> findAllRole();

    void userroleedel(Integer id);

    void userroleedit(Integer id, Integer rid);
}