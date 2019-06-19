package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by Winchester on 2019/6/19.
 */
public interface AuthorityService {

    List<Authority> selectUsermenuById(Integer id);
}
