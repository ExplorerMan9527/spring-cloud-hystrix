package com.lgj.study;

import com.lgj.study.hystrix.ProviderClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guangjie.Liao
 * @Title: ExampleService
 * @ProjectName spring-cloud-hystrix
 * @Description: TODO
 * @date 2019/1/715:05
 */
@FeignClient(value = "provider", fallbackFactory = ProviderClientServiceFallbackFactory.class)
public interface ExampleService {

    @RequestMapping(value = "/provider/test")
    String test(String name);
}
