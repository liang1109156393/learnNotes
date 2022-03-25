package com.zxl.basic.springboot.enableconfig;

import java.lang.annotation.*;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/8 8:46
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface EnableDemoConfiguration  {
}
