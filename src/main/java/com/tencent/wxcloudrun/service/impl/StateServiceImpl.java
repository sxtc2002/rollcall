package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.StateMapper;
import com.tencent.wxcloudrun.model.State;
import com.tencent.wxcloudrun.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class StateServiceImpl implements StateService {
    final StateMapper stateMapper;

    public StateServiceImpl(@Autowired StateMapper stateMapper) {
        this.stateMapper = stateMapper;
    }

    @Override
    public void insert(String Student_Id, String Course_Id, String Course_Date, String Student_State) {
        stateMapper.insert(Student_Id, Course_Id, Course_Date, Student_State);
    }

    @Override
    public void update(String Student_Id, String Course_Id, String Course_Date, String Student_State) {
        stateMapper.update(Student_Id, Course_Id, Course_Date, Student_State);
    }

    @Override
    public void delete(String Student_Id, String Course_Id, String Course_Date) {
        stateMapper.delete(Student_Id, Course_Id, Course_Date);
    }

    @Override
    public ArrayList<State> select_name(String Student_Name) {
        return stateMapper.select_name(Student_Name);
    }

    @Override
    public ArrayList<State> select_state(String Course_Id, String Course_Date, String Student_State) {
        return stateMapper.select_state(Course_Id, Course_Date, Student_State);
    }
}
