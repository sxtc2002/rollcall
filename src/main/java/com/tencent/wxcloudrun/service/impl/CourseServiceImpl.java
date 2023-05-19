package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.CourseMapper;
import com.tencent.wxcloudrun.model.Course;
import com.tencent.wxcloudrun.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseServiceImpl implements CourseService {
    final CourseMapper courseMapper;

    public CourseServiceImpl(@Autowired CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Override
    public void insert(String Course_Id, String Course_Name, String Teacher_Id) {
        courseMapper.insert(Course_Id, Course_Name, Teacher_Id);
    }

    @Override
    public void delete(String Course_Id) {
        courseMapper.delete(Course_Id);
    }

    @Override
    public ArrayList<Course> select() {
        return courseMapper.select();
    }
}
