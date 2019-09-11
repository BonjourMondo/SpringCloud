package com.demo.client.service;

import com.demo.serverapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("eureka-provider")
public interface RefactorHelloService extends HelloService {
}
