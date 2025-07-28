package org.annotationdemo.MyAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target; /**
 * AnyAnnotation AnyAnnotation
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 17:05
 * @version: v1.0.0
 * @since: 2025/7/28 17:05
 **/
// AnyAnnotation.java
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.PACKAGE, ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD,
        ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
public @interface AnyAnnotation {
    int order() default 0;
    String desc() default "";
}
