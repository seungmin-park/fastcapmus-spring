package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 class 는 REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI 를 지정해주는 Annotation
public class AplController {

    @GetMapping("/hello") //http://localhost:4000/api/hello
    public String hello(){
        return "hello spring boot!";
    }
}
