package com.leon.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.leon.api.service.IHelloworldService;

/**
 * 服务消费方
 * 
 * 注解"@Reference(version = "${demo.service.version}")"引用服务方提供的接口
 * 
 * @author leon
 */
@RestController
public class ConsumerController {
	@Reference(version = "${demo.service.version}")
	private IHelloworldService helloWorld;

	@RequestMapping("/dubbo/helloWorld")
	public String helloWorld() {
		return helloWorld.dubbo();
	}
}
