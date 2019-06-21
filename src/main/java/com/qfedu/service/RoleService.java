package com.qfedu.service;

import com.qfedu.pojo.Authority;
import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
public interface RoleService {
    List<User> findAll(User user);

    void userdelById01(Integer id);

    List<Role> findAllRole();

    void userroleedit(Integer id, String rids);

    List<Role> findAllByRole(Role role);

    List<Authority> findAllAuthority();

    void roleedit(Integer id, String[] aids);

    void roledelById01(Integer id);
}