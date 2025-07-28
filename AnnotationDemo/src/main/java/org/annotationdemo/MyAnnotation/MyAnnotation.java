package org.annotationdemo.MyAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * MyAnnotation 自定义注解
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 16:22
 * @version: v1.0.0
 * @since: 2025/7/28 16:22
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MyAnnotation {
    String description() default "";
}
