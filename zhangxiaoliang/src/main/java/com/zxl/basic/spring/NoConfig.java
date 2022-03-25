package com.zxl.basic.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 22:10
 */
@Component
public class NoConfig {
    @Bean
    public MyBeanNoConfig myBeanNoConfig(){
        return new MyBeanNoConfig();
    }
}
