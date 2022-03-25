package com.zxl.basic.spring.Listener;

import org.springframework.context.ApplicationEvent;
/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 9:25
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
