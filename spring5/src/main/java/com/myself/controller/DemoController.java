package com.myself.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {
    @RequestMapping("hello")
    public String Hello(){
        return "Hello Spring5 !!!";
    }
}
