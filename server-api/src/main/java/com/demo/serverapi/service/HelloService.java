package com.demo.serverapi.service;

import com.demo.serverapi.dto.User;
import org.springframework.web.bind.annotation.*;

public interface HelloService {
    @GetMapping(value = "/hello1")
    String hello(@RequestParam("name") String name);

    @GetMapping(value = "/hello2")
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @PostMapping(value = "/hello3")
    String hello(@RequestBody User user);
}
