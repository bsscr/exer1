package com.btjf.function.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("hi")
    public String hi(){
        return "I'm forezp";
    }
}
