package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.SelectionMapper;
import com.tencent.wxcloudrun.model.State;
import com.tencent.wxcloudrun.service.SelectionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class SelectionServiceImpl implements SelectionService {
    final SelectionMapper selectionMapper;

    public SelectionServiceImpl(@Autowired SelectionMapper selectionMapper) {
        this.selectionMapper = selectionMapper;
    }

    @Override
    public void insert(String Course_Id, String Student_Id) {
        selectionMapper.insert(Course_Id, Student_Id);
    }

    @Override
    public void delete(String Course_Id, String Student_Id) {
        selectionMapper.delete(Course_Id, Student_Id);
    }

    @Override
    public ArrayList<State> select(String Course_Id) {
        return selectionMapper.select(Course_Id);
    }
}
