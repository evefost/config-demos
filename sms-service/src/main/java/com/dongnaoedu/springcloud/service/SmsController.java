package com.dongnaoedu.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 此处很重要 +++
public class SmsController {

	@Value("${tony.configString}")
	private String configString;

	// 测试注入tony.configString配置
	@RequestMapping("/test")
	public String sendSms() {
		return "configString的值：" + configString;
	}

	@Autowired
	Environment env;

	@RequestMapping("/get/{configName}")
	public String test(@PathVariable String configName) {
		return configName + "的值为：" + env.getProperty("tony." + configName);
	}
}
