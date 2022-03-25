package com.zxl.basic.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 14:31
 */
public class MyFactoryBean implements FactoryBean<MyBean> {
    @Override
    public MyBean getObject() throws Exception {
        return new MyBean("myFactoryBean",13);
    }

    @Override
    public Class<?> getObjectType() {
        return MyBean.class;
    }
}
