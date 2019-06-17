package com.qfedu.service;

import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by Winchester on 2019/6/14.
 */
public interface StudentService {
    Map<String,Object> findByPage(Integer page, Integer limit);

    List<Grade> findGradeAll();

    List<Staff> findStaffAll();

    void addStudent(Student student);


    void addStus(List<Student> stuList);
}
