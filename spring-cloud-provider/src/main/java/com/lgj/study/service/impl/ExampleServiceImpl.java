package com.lgj.study.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author guangjie.Liao
 * @Title: ExampleServiceImpl
 * @ProjectName spring-cloud-hystrix
 * @Description: TODO
 * @date 2019/1/711:20
 */
@Component
public class ExampleServiceImpl{

    @Value("${name}")
    private String providerName ;

    public String test(String name){
        return "你好！"+name+" "+providerName+" 为您服务!";
    }
}
