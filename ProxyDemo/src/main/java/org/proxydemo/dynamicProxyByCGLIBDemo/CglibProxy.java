package org.proxydemo.dynamicProxyByCGLIBDemo;

import lombok.Getter;
import lombok.Setter;
import org.proxydemo.tookit.MonitorUtil;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibProxy 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:52
 * @version: v1.0.0
 * @since: 2025/7/30 11:52
 **/
@Getter
@Setter
public class CglibProxy<T> implements MethodInterceptor {

    private T target;

    public CglibProxy(T target) {
        this.target = target;
    }

    public T getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    public T getProxy(Class<?>[] argumentTypes, Object[] arguments) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create(argumentTypes, arguments);
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();
        Object result = proxy.invokeSuper(obj, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}