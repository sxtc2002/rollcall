package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CourseMapper {
    void insert(String Course_Id, String Course_Name, String Teacher_Id);
    void delete(String Course_Id);
    ArrayList<Course> select();
}
