package org.proxydemo.tookit;

/**
 * MonitorUtil 检测方法执行时间工具类
 *
 * @author: tanfuzeng
 * @date: 2025/7/30 11:18
 * @version: v1.0.0
 * @since: 2025/7/30 11:18
 **/
public class MonitorUtil {
    private static ThreadLocal<Long> tl = new ThreadLocal<>();

    public static void start() {
        tl.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - tl.get()) + "ms");
    }
}
