package com.qfedu.dao;

import com.qfedu.pojo.Grade;

import java.util.List;

/**
 * Created by Winchester on 2019/6/17.
 */
public interface GradeDao {
    List<Grade> findAllGrade();

    List<Grade> findGradeAll();
}
