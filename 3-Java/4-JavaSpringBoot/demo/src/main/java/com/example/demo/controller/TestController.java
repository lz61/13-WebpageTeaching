package com.example.demo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 注意: 是RestController而不是Controller!
@RestController
@RequestMapping("/test") // /test表示访问路径,完整路径为: localhost:[portNum]/test
public class TestController {
    @GetMapping("")
    public String test() throws IOException {
        return "hello";
    }
}