package com.example.hessianserversb;

import org.springframework.stereotype.Service;

@Service("HelloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    private String _greeting = "Hello, world";

    public void setGreeting(String greeting)
    {
        _greeting = greeting;
    }

    public String hello()
    {
        return _greeting;
    }
}