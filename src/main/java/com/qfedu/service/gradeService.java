package com.qfedu.service;

import com.qfedu.pojo.Grade;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/17.
 */
public interface GradeService {
    Map<String,Object> findByPage(Integer page, Integer limit);

    List<Grade> findGradeAll();
}
