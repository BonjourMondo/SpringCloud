package com.demo.client.controller;

import com.demo.client.service.RefactorHelloService;
import com.demo.serverapi.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: leesanghyuk
 * Date: 2019-09-11 15:14
 * Description:
 */
@RestController
@RequestMapping("/")
public class ConsumerHelloController {

    @Autowired
    private RefactorHelloService helloService;

    @RequestMapping("/feign1")
    public String hello() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(helloService.hello("name1")).append("\n");
        stringBuilder.append(helloService.hello("name2", 2)).append("\n");
        stringBuilder.append(helloService.hello(new User("name3", 3))).append("\n");
        return stringBuilder.toString();
    }
}
