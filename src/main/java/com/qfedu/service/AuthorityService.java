package com.qfedu.service;

import com.qfedu.pojo.Authority;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/19.
 */
public interface AuthorityService {

    List<Authority> selectUsermenuById(Integer id);

    Map<String,Object> findByPage(Integer page, Integer limit);


    List<Authority> selectParentRoot(Integer parentId);

    void authorityadd(Authority authority);

    void deleteById(Integer id);
}
