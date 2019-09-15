package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootMybatisApplication {

	
	//http://localhost:8080/api-b/login.html
	//http://localhost:8080/login.html
	//http://localhost:8080/swagger-ui.html
	//http://localhost:8080/druid/index.html
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}
	
	
	/**
	 * 差引入ehcache  
	 * 监控中心
	 * 还有一些工具类,aop 异步 log 
	 * 
	 * 页面还差一个多选删除，还差一个排序 
	 * 
	 * */
}
