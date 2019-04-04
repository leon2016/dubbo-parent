package com.leon.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 服务消费方启动类
 * 
 * "@EnableDubbo"开启dubbo支持
 * 
 * @author leon
 *
 */
@EnableDubbo
@SpringBootApplication
public class EggConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EggConsumerApplication.class, args);
	}
}
