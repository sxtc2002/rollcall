package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Selection;
import com.tencent.wxcloudrun.service.SelectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SelectionController {
    final SelectionService selectionService;

    public SelectionController(SelectionService selectionService) {
        this.selectionService = selectionService;
    }

    @PostMapping("/selection/insert")
    ApiResponse insert(@RequestBody Selection selection) {
        selectionService.insert(selection.getCourse_Id(), selection.getStudent_Id());
        return ApiResponse.ok(0);
    }

    @PostMapping("/selection/delete")
    ApiResponse delete(@RequestBody Selection selection) {
        selectionService.delete(selection.getCourse_Id(), selection.getStudent_Id());
        return ApiResponse.ok(0);
    }

    @PostMapping("/selection/select")
    ApiResponse select(@RequestBody Selection selection) {
        return ApiResponse.ok(selectionService.select(selection.getCourse_Id()));
    }
}
