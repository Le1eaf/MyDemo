package org.proxydemo.staticProxyByCombinationDemo;

/**
 * StudentProxy 学生代理类
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:04
 * @version: v1.0.0
 * @since: 2025/7/30 11:04
 **/
public class StudentsProxy implements Person{
    Student stu;

    public StudentsProxy(Person stu) {
        // 只代理学生对象
        if(stu.getClass() == Student.class) {
            this.stu = (Student)stu;
        }
    }

    @Override
    public void giveMoney() {
        System.out.println("代理学生进行交费：开始交费");
        stu.giveMoney();
        System.out.println("代理学生进行交费：结束交费");
    }
}
