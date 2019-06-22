package com.qfedu.service.impl;

import com.qfedu.dao.AuthorityDao;
import com.qfedu.dao.RoleDao;
import com.qfedu.pojo.Authority;
import com.qfedu.pojo.Role;
import com.qfedu.pojo.User;
import com.qfedu.service.AuthorityService;
import com.qfedu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/20 0020.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private AuthorityDao authorityDao;

    @Override
    public List<User> findAll(User user) {
        return roleDao.findAll(user);
    }

    @Override
    public void userdelById01(Integer id) {
        roleDao.userdelById01(id);
    }

    @Override
    public List<Role> findAllRole() {
        return roleDao.findAllRole();
    }

    @Override
    public void userroleedit(Integer id, String rids) {
        roleDao.userroleedel(id);
        if(rids!=null && rids!=""){
            String[] arr = rids.split(",");
            for(String rid:arr) {
                Integer rid1 = Integer.parseInt(rid);
                roleDao.userroleedit(id, rid1);
            }
        }
    }

    @Override
    public List<Role> findAllByRole(Role role) {
        return roleDao.findAllByRole(role);
    }

    @Override
    public List<Authority> findAllAuthority() {
        return authorityDao.findAllAuthority();
    }

    @Override
    public void roleedit(Integer id, String[] aids) {
        roleDao.roleedel(id);
        if(aids != null){
            for(String aid:aids) {
                Integer rid1 = Integer.parseInt(aid);
                roleDao.roleedit(id, rid1);
            }
        }
    }

    @Override
    public void roledelById01(Integer id) {
        roleDao.roledelById01(id);
    }
}