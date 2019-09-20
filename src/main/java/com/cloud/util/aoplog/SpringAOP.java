package com.cloud.util.aoplog;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
 
@Aspect
@Configuration
@Slf4j
public class SpringAOP {
 
    /**
     * 定义切点Pointcut
     * 第一个*号：表示返回类型， *号表示所有的类型
     * 第二个*号：表示类名，*号表示所有的类
     * 第三个*号：表示方法名，*号表示所有的方法
     * 后面括弧里面表示方法的参数，两个句点表示任何参数
     */
    //@Pointcut("execution(*  com.cloud.business.bussinessSum.*.*(..))")
    @Pointcut("execution(*  com.cloud.business.hospital.*.*(..))")
    public void executionService() {}
 
    
    @Around("executionService()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

        String url = request.getRequestURL().toString();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        
        String requestId = String.valueOf(UUID.randomUUID());
        MDC.put("requestId",requestId);
        
        log.info("请求开始, 各个参数, url: {}, method: {}, uri: {}, params: {}", url, method, uri, queryString);
        // result的值就是被拦截方法的返回值
        Object result = pjp.proceed();
        log.info(String.valueOf(result));
        //JSONObject dd = JSONObject.parseObject(JSON.toJSONString(result));
        //dd.put("traceId",requestId);


        //log.info("请求结束，controller的返回值是 {} - {}", requestId, dd.toJSONString());
       // log.info("请求结束，controller的返回值是 {} - {}", requestId, dd.toJSONString());
        
        MDC.clear();
        return result;
    }
    
    
}