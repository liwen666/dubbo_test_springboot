package com.xyz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xyz.service.IHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsumer {

	@Reference
	private IHelloService helloService;

	@GetMapping("sayHello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return helloService.sayHello(name);
	}
}
