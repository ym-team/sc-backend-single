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
	 * 页面还差一个多选删除，还差一个排序,差excel上传和下载，详情页（直接用update页）
	 * 还差一个加解密 传输
	 * aop 异步 log+ traceId	：https://www.jianshu.com/p/08f5231c3d32   https://www.cnblogs.com/baobaoxiaokeai/p/11052738.html
	 * 阻止二次提交 表单重复提交
	 * crf之类
	 * 限流策略
	 * 还有一个bug就是权限赋值需要重启
	 * */
}
