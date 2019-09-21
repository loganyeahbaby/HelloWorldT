package com.example.helloworldt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Logan
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hi";
    }
}
