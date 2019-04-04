package com.leon.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leon.api.service.IHelloworldService;

/**
 * 服务提供方实现API接口
 * 
 * 注解"@service" 声明需要暴露的服务接口
 * 
 * 
 * @author leon
 *
 */
@Service(version = "${demo.service.version}")
public class HelloworldImpl implements IHelloworldService {

	@Override
	public String dubbo() {

		return "hello world!";

	}

}
