package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Selection implements Serializable {
    private String Course_Id;
    private String Student_Id;
}
