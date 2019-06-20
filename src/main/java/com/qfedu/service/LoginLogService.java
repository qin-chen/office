package com.qfedu.service;

import com.qfedu.pojo.LoginLog;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/19.
 */
public interface LoginLogService {

    Map<String,Object> findByPage(Integer page, Integer limit);
}
