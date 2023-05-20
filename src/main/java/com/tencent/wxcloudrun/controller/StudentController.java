package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Student;
import com.tencent.wxcloudrun.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StudentController {
    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student/insert")
    ApiResponse insert(@RequestBody Student student) {
        studentService.insert(student.getStudent_Id(), student.getStudent_Name());
        return ApiResponse.ok(0);
    }

    @PostMapping("/student/delete")
    ApiResponse delete(@RequestBody Student student) {
        studentService.delete(student.getStudent_Id());
        return ApiResponse.ok(0);
    }

    @PostMapping("/student/select")
    ApiResponse select() {
        return ApiResponse.ok(studentService.select());
    }
}
