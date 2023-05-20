package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface StudentMapper {
    void insert(String Student_Id, String Student_Name);
    void delete(String Student_Id);
    ArrayList<Student> select();
}
