package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.State;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface SelectionService {
    void insert(String Course_Id, String Student_Id);
    void delete(String Course_Id, String Student_Id);
    ArrayList<State> select(String Course_Id);
}
