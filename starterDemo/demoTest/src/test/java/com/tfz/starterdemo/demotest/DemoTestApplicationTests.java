package com.tfz.starterdemo.demotest;

import com.tfz.starterDemo.demospringbootstarter.ServiceBean;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoTestApplicationTests {

    @Resource
    private ServiceBean serviceBean;

    @Test
    void contextLoads() {
        System.out.println(serviceBean.sayHello("tfz"));
    }

}
