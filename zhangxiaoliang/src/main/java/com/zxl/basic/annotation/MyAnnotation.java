package com.zxl.basic.annotation;

import java.lang.annotation.*;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 21:50
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String name() default "zxl";
}
