package com.kk.jenkins_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {
    @RequestMapping("/")
    public Object index(){
        return "ok";
    }
}
