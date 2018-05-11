package com.xyz;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 生产者
 * @author czk
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProviderApplication.class, args);
	}
	
}
