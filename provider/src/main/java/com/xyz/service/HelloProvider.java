package com.xyz.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class HelloProvider implements IHelloService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name + " !";
	}

}
