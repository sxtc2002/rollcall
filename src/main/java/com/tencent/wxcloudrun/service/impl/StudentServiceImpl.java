package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.StudentMapper;
import com.tencent.wxcloudrun.model.Student;
import com.tencent.wxcloudrun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {
    final StudentMapper studentMapper;

    public StudentServiceImpl(@Autowired StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void insert(String Student_Id, String Student_Name) {
        studentMapper.insert(Student_Id, Student_Name);
    }

    @Override
    public void delete(String Student_Id) {
        studentMapper.delete(Student_Id);
    }

    @Override
    public ArrayList<Student> select() {
        return studentMapper.select();
    }
}
