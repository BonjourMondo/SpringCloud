package com.demo.server.controller;

import com.demo.serverapi.dto.User;
import com.demo.serverapi.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

/**
 * Author: leesanghyuk
 * Date: 2019-09-11 15:04
 * Description:
 */
@RequestMapping("/")
@RestController
@EnableEurekaClient
@Slf4j
public class HelloController implements HelloService {


    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello,"+name;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "hello,"+user.getName()+",age:"+user.getAge();
    }
}
