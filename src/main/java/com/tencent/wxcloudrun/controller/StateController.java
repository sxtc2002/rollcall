package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.State;
import com.tencent.wxcloudrun.service.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class StateController {
    final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @PostMapping("/state/insert")
    ApiResponse insert(@RequestBody State state) {
        stateService.insert(state.getStudent_Id(), state.getCourse_Id(), state.getCourse_Date(), state.getStudent_State());
        return ApiResponse.ok(0);
    }

    @PostMapping("/state/update")
    ApiResponse update(@RequestBody State state) {
        stateService.update(state.getStudent_Id(), state.getCourse_Id(), state.getCourse_Date(), state.getStudent_State());
        return ApiResponse.ok(0);
    }

    @PostMapping("/state/delete")
    ApiResponse delete(@RequestBody State state) {
        stateService.delete(state.getStudent_Id(), state.getCourse_Id(), state.getCourse_Date());
        return ApiResponse.ok(0);
    }

    @PostMapping("/state/select_name")
    ApiResponse select_name(@RequestBody String Student_Name) {
        return ApiResponse.ok(stateService.select_name(Student_Name));
    }

    @PostMapping("/state/select_state")
    ApiResponse select_state(@RequestBody State state) {
        return ApiResponse.ok(stateService.select_state(state.getCourse_Id(), state.getCourse_Date(), state.getStudent_State()));
    }
}
