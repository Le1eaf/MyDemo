package org.annotationdemo.AnnotationTest;

import org.annotationdemo.MyAnnotation.MyAnnotation;

/**
 * AnnotationTest 枚举/类/接口说明
 *
 * @author: tanfuzeng
 * @date: 2025/7/28 16:24
 * @version: v1.0.0
 * @since: 2025/7/28 16:24
 **/
@MyAnnotation
public class AnnotationTest {
    // @MyAnnotation   用在属性上则会报错
    //@MyAnnotation
    public String name;

    @MyAnnotation
    public void test(){}
}
