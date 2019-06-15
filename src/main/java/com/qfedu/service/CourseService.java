package com.qfedu.service;

import com.qfedu.pojo.Course;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
public interface CourseService {
    List<Course> findAll();

    void updateByCourse(Course course);

    void insertByCourse(Course course);

    void deleteById(Integer id);
}
