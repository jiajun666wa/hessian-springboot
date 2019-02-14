package com.example.hessianclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/test")
    public String test() {
        return helloWorldService.hello();
    }
}