package com.example.disconf;

import com.example.disconf.config.AppConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ImportResource("classpath:spring-disconf.xml")
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
public class DemoApplication {

	@Autowired
	private AppConf appConf;

	@GetMapping("/")
	public Object home() {
		return "hello" + appConf.getAppName();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
