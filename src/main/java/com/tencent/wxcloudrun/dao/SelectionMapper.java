package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.State;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface SelectionMapper {
    void insert(String Course_Id, String Student_Id);
    void delete(String Course_Id, String Student_Id);
    ArrayList<State> select(String Course_Id);
}
