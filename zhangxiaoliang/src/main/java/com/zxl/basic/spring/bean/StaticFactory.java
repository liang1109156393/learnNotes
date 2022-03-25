package com.zxl.basic.spring.bean;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 14:25
 */
public class StaticFactory {
    public static MyBean builderMyBean(){
        return new MyBean("静态工厂创建",123);
    }
}
