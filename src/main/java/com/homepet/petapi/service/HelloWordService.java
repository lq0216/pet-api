package com.homepet.petapi.service;

import com.homepet.pet.service.IHelloWorldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: pet-api
 * @description:
 * @author: tiezhu
 * @create: 2019-07-25 14:28
 **/
@Service
public class HelloWordService {

    @Resource
    private IHelloWorldService helloWorldService;

    public String helloWorld() {
        return helloWorldService.helloWorld();
    }
}
