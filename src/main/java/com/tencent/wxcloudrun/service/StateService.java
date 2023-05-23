package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.State;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface StateService {
    void insert(String Student_Id, String Course_Id, String Course_Date, String Student_State);
    void update(String Student_Id, String Course_Id, String Course_Date, String Student_State);
    void delete(String Student_Id, String Course_Id, String Course_Date);
    ArrayList<State> select_name(String Student_Name);
    ArrayList<State> select_state(String Course_Id, String Course_Date, String Student_State);
}
