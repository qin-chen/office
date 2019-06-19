package com.qfedu.dao;

import com.qfedu.pojo.Grade;

import java.util.List;

/**
 * Created by Winchester on 2019/6/18.
 */
public interface GradeDao1 {

    List<Grade> findAllGrade();

    List<Grade> findGradeAll();

    void gradeupdate(Grade grade);

    void gradeadd(Grade grade);

    Grade selectById(Integer id);

    void gradedeleteById(Integer id);
}
