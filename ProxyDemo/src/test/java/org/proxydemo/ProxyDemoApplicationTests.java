package org.proxydemo;

import org.junit.jupiter.api.Test;
import org.proxydemo.dynamicProxyByCGLIBDemo.CglibProxy;
import org.proxydemo.dynamicProxyByCGLIBDemo.PersonV2;
import org.proxydemo.dynamicProxyByCGLIBDemo.StudentV2;
import org.proxydemo.dynamicProxyByJDKDemo.StuInvocationHandler;
import org.proxydemo.staticProxyDemo.Person;
import org.proxydemo.staticProxyDemo.Student;
import org.proxydemo.staticProxyDemo.StudentsProxy;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@SpringBootTest
class ProxyDemoApplicationTests {

    @Test
    // 静态代理
    void contextLoads() {
        //创建一位叫张三的学生
        Person zhangsan = new Student("张三");

        //创建班长，他代理张三交班费
        Person monitor = new StudentsProxy(zhangsan);

        //班长执行代理方法
        monitor.giveMoney();
    }

    @Test
    // JDK动态代理
    void contextLoads2() {
        Person zhangsan = new Student("张三");

        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);

        Person stuProxy = (Person) Proxy.
                newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class},
                stuHandler);

        stuProxy.giveMoney();
    }

    @Test
    // CGLIB动态代理
    void contextLoads3() {
        // 现在可以使用简单方式创建代理，因为StudentV2有了无参构造函数
        CglibProxy<StudentV2> cglibProxy = new CglibProxy<>(new StudentV2("李四"));
        cglibProxy.getProxy(
                new Class<?>[]{String.class},
                new Object[]{cglibProxy.getTarget().getName()})
                .giveMoney();

    }
}