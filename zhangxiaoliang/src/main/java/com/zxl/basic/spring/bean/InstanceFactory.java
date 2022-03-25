package com.zxl.basic.spring.bean;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 14:27
 */
public class InstanceFactory {
    public MyBean buildInstance(){
        return new MyBean("实例工厂",13);
    }
}
