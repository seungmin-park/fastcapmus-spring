package com.example.filter.controller;

import com.example.filter.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class ApiController {
    public User user(@RequestBody User user){
        log.info("user : {}", user);
        return user;
    }
}
