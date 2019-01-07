package com.lgj.study.controller;

import com.lgj.study.service.impl.ExampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangjie.Liao
 * @Title: ExampleProvider
 * @ProjectName spring-cloud-ribbon
 * @Description: TODO
 * @date 2018/12/2815:21
 */
@RestController
@RequestMapping(value = "/provider")
public class ExampleProviderController {

    @Autowired
    private ExampleServiceImpl exampleService;

    @RequestMapping(value = "/test")
    public String test(String name){
        //int i = 1/0; 模拟服务出错，不可用
        return exampleService.test(name);
    }
}
