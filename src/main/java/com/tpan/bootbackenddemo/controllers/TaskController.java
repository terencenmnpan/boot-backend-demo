package com.tpan.bootbackenddemo.controllers;

import com.tpan.bootbackenddemo.dtos.TaskUserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping(value = "/getTaskUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TaskUserDto> getTaskUsers() {
        return null;
    }
}
