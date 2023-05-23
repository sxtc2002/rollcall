package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.State;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface StateMapper {
    void insert(String Student_Id, String Course_Id, String Course_Date, String Student_State);
    void update(String Student_Id, String Course_Id, String Course_Date, String Student_State);
    void delete(String Student_Id, String Course_Id, String Course_Date);
    ArrayList<State> select_name(String Student_Name);
    ArrayList<State> select_state(String Course_Id, String Course_Date, String Student_State);
}
