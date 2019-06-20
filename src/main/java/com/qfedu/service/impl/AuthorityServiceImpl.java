package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.AuthorityDao;
import com.qfedu.pojo.Authority;
import com.qfedu.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public Map<String, Object> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Authority> list = authorityDao.findAllAuthority();
        System.out.println(list+"++++++");
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @Override
    public List<Authority> selectParentRoot(Integer parentId) {
        return authorityDao.selectParentRoot(parentId);
    }

    @Override
    public void authorityadd(Authority authority) {
        authorityDao.authorityadd(authority);
    }

    @Override
    public void deleteById(Integer id) {
        authorityDao.deleteById(id);
    }
}
