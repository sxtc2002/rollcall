package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface TeacherService {
    void insert(String Teacher_Id, String Teacher_Name);
    void delete(String Teacher_Id);
    ArrayList<Teacher> select();
}
