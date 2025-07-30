package org.proxydemo.dynamicProxyByJDKDemo;

import org.proxydemo.tookit.MonitorUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * StuInvocationHandler 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:20
 * @version: v1.0.0
 * @since: 2025/7/30 11:20
 **/
public class StuInvocationHandler<T> implements InvocationHandler {
    //invocationHandler持有的被代理对象
    T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    /**
     * proxy:代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");

        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
