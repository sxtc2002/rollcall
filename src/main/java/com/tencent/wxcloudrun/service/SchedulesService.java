package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Schedules;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface SchedulesService {
    void insert(String Course_Id, String Course_Data);
    void delete(String Course_Id, String Course_Data);
    ArrayList<Schedules> select(String Course_Id);
}
