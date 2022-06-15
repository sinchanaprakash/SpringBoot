package com.prograd.Demo.App.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/studentName")
    public List<com.prograd.Demo.App.studentName> getName(){
        return Arrays.asList(
                new com.prograd.Demo.App.studentName("ria"),
                new com.prograd.Demo.App.studentName("spring"),
                new com.prograd.Demo.App.studentName("sinchana"),
                new com.prograd.Demo.App.studentName("java"),
                new com.prograd.Demo.App.studentName("json")
        );
    }
}
