package org.proxydemo.staticProxyDemo;

/**
 * Student 学生类
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:02
 * @version: v1.0.0
 * @since: 2025/7/30 11:02
 **/
public class Student implements  Person{
    private String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
