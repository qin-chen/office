package com.qfedu.dao;

import com.qfedu.pojo.LoginLog;

import java.util.List;

/**
 * Created by Winchester on 2019/6/19.
 */
public interface LoginLogDao {
    List<LoginLog> findAllLoginLog();
}
