package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Schedules;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface SchedulesMapper {
    void insert(String Course_Id, String Course_Data);
    void delete(String Course_Id, String Course_Data);
    ArrayList<Schedules> select(String Course_Id);
}
