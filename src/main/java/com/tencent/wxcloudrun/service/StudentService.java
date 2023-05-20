package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface StudentService {
    void insert(String Student_Id, String Student_Name);
    void delete(String Student_Id);
    ArrayList<Student> select();
}
