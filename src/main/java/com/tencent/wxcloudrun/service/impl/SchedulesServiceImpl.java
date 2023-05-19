package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.SchedulesMapper;
import com.tencent.wxcloudrun.model.Schedules;
import com.tencent.wxcloudrun.service.SchedulesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class SchedulesServiceImpl implements SchedulesService {
    final SchedulesMapper schedulesMapper;

    public SchedulesServiceImpl(@Autowired SchedulesMapper schedulesMapper) {
        this.schedulesMapper = schedulesMapper;
    }

    @Override
    public void insert(String Course_Id, String Course_Data) {
        schedulesMapper.insert(Course_Id, Course_Data);
    }

    @Override
    public void delete(String Course_Id, String Course_Data) {
        schedulesMapper.delete(Course_Id, Course_Data);
    }

    @Override
    public ArrayList<Schedules> select(String Course_Id) {
        return schedulesMapper.select(Course_Id);
    }
}
