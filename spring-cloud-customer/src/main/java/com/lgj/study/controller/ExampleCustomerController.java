package com.lgj.study.controller;

import com.lgj.study.ExampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author guangjie.Liao
 * @Title: ExampleCustomerController
 * @ProjectName spring-cloud-ribbon
 * @Description: TODO
 * @date 2018/12/2815:26
 */
@RestController
@RequestMapping(value = "/customer")
public class ExampleCustomerController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value = "/test")
    public String test2(){
        return  exampleService.test("廖广杰");
    }

}
