package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface TeacherMapper {
    void insert(String Teacher_Id, String Teacher_Name);
    void delete(String Teacher_Id);
    ArrayList<Teacher> select();
}
