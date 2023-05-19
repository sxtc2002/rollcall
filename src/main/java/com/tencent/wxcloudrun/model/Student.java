package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String Student_Id;
    private String Student_Name;
}
