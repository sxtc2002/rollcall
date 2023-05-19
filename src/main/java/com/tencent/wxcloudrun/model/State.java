package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class State implements Serializable {
    private String Student_Id;
    private String Course_Id;
    private String Course_Date;
    private String Student_State;
    private String Student_Name;
}
