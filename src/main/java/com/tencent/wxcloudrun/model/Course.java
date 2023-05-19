package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {
    private String Course_Id;
    private String Course_Name;
    private String Teacher_Id;
}
