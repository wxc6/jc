package com.jc.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题
 *
 * @author wxc
 * @date 2024/4/11 16:54
 */
@RestController
@RequestMapping("subject")
public class SubjectController {
    @GetMapping("test")
    public String test(){
       return "subject";
    }
}
