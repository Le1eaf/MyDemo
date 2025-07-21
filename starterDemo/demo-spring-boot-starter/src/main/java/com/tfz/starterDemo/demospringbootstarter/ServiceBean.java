package com.tfz.starterDemo.demospringbootstarter;

/**
 * ServiceBean 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/21 13:29
 * @version: v1.0.0
 * @since: 2025/7/21 13:29
 **/
public class ServiceBean {
    public String sayHello(String name){
        return String.format("Hello World, %s", name);
    }
}
