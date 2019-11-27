package com.example.conttoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("info")
    public String indfo(){
        return "hello SPringBoot Info";
    }
}
