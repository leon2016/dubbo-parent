package com.leon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 服务提供启动类
 * 
 * "@EnableDubbo"开启dubbo支持
 * 
 * @author leon
 *
 */
@EnableDubbo
@SpringBootApplication
public class EggProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EggProviderApplication.class, args);
	}
}
