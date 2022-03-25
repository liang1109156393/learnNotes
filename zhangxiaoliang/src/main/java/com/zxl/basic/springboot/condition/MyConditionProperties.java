package com.zxl.basic.springboot.condition;

import com.zxl.basic.springboot.condition.MyCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/8 13:57
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(MyCondition.class)
public @interface MyConditionProperties {
    String prefix() default "";
}
