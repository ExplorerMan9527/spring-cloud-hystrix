package com.lgj.study.hystrix;


import com.lgj.study.ExampleService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author guangjie.Liao
 * @Title: ProviderClientServiceFallbackFactory
 * @ProjectName spring-cloud-hystrix
 * @Description: TODO
 * @date 2019/1/711:24
 */
@Component
public class ProviderClientServiceFallbackFactory implements FallbackFactory<ExampleService> {

    @Override
    public ExampleService create(Throwable throwable) {
        return new ExampleService() {
            @Override
            public String test(String name) {
                return "不好意思，服务暂停了！";
            }
        };
    }
}
