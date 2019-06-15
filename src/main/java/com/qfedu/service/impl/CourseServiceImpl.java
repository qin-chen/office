package com.qfedu.service.impl;

import com.qfedu.dao.CourseDao;
import com.qfedu.pojo.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/14 0014.
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public void updateByCourse(Course course) {
        courseDao.updateByCourse(course);
    }

    @Override
    public void insertByCourse(Course course) {
        courseDao.insertByCourse(course);
    }

    @Override
    public void deleteById(Integer id) {
        courseDao.deleteById(id);
    }
}