package org.annotationdemo.MyAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RequestMapping 简单接口示例
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 16:40
 * @version: v1.0.0
 * @since: 2025/7/28 16:40
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface RequestMapping {
    public String method() default "GET";
    public String path();
    public boolean required();
}
