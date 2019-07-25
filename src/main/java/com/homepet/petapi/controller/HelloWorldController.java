package com.homepet.petapi.controller;

import com.homepet.petapi.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: pet-api
 * @description: he
 * @author: tiezhu
 * @create: 2019-07-25 14:28
 **/
@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWorld() {
        return helloWordService.helloWorld();
    }
}
