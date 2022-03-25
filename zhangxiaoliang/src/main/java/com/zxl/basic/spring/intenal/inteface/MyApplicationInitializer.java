package com.zxl.basic.spring.intenal.inteface;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/4 13:45
 * 1、在springboot中添加上下文初始化类
 * 2、在application中添加配置
 * 3、在META-INFO/spring.factories中添加配置
 */
public class MyApplicationInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("springContext 上下文初始化容器");
    }
}
