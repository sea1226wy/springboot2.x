package com.springboot.controller;

import com.springboot.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @auther Seay
 * @date 2019/4/8 15:53
 */
@RestController
public class SampleController {
    @RequestMapping("/")
    String Home(){
        return "Hello World";
    }

    @GetMapping("/testjson")
    public Object testjson(){
        return new User(111,"+","110",new Date());
    }
}