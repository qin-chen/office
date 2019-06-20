package com.qfedu.dao;

import com.qfedu.pojo.Authority;

import java.util.List;

/**
 * Created by Winchester on 2019/6/19.
 */
public interface AuthorityDao {

    List<Authority> selectUsermenuById(Integer id);

    List<Authority> findAllAuthority();

    List<Authority> selectParentRoot(Integer parentId);

    void authorityadd(Authority authority);

    void deleteById(Integer id);
}
