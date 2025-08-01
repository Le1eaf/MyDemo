package org.proxydemo.staticProxyByInheritDemo;

import org.proxydemo.staticProxyByCombinationDemo.Student;

/**
 * Monitor 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/8/1 9:50
 * @version: v1.0.0
 * @since: 2025/8/1 9:50
 **/
public class Monitor extends StudentV4{

    StudentV4 stu;

    public Monitor(String name, StudentV4 stu) {
        super(name);
        this.stu = stu;
    }

    @Override
    public void giveMoney() {
        System.out.println("代理学生进行交费：开始交费");
        super.giveMoney();
        System.out.println("代理学生进行交费：结束交费");
    }
}
