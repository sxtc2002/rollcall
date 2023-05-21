package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.TeacherMapper;
import com.tencent.wxcloudrun.model.Teacher;
import com.tencent.wxcloudrun.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class TeacherServiceImpl implements TeacherService {
    final TeacherMapper teacherMapper;

    public TeacherServiceImpl(@Autowired TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override
    public void insert(String Teacher_Id, String Teacher_Name) {
        teacherMapper.insert(Teacher_Id, Teacher_Name);
    }

    @Override
    public void delete(String Teacher_Id) {
        teacherMapper.delete(Teacher_Id);
    }

    @Override
    public ArrayList<Teacher> select() {
        return teacherMapper.select();
    }
}
