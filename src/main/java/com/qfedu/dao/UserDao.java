package com.qfedu.dao;

import com.qfedu.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 星尘 on 2019/6/14.
 */
public interface UserDao {
     public User loginValidate(@Param("no") String no , @Param("password") String password);
}
