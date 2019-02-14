package com.example.hessianserversb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllser {

    @RequestMapping("/show")
    public String show() {
        return "12";
    }
}
