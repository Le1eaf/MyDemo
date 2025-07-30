package org.proxydemo.dynamicProxyDemo;

import org.proxydemo.dynamicProxyDemo.Person;

/**
 * Student 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:17
 * @version: v1.0.0
 * @since: 2025/7/30 11:17
 **/
public class Student implements Person {
    private String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");
    }
}
