package com.qfedu.dao;

import com.qfedu.pojo.Grade;
import com.qfedu.pojo.Staff;
import com.qfedu.pojo.Student;

import java.util.List;

/**
 * Created by Winchester on 2019/6/14.
 */
public interface StudentDao {
    List<Student> findAllStu();

    List<Grade> findGradeAll();

    List<Staff> findStaffAll();

    void addStudent(Student student);

    void addBatch(List<Student> stuList);

    Student selectByNo(String no);

    void studentdelete(String no);
}
