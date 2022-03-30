package com.zxl.basic.springboot.enableconfig;

import com.zxl.basic.springboot.condition.MyConditionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 19:59
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnBean(
        annotation = {EnableDemoConfiguration.class}
)
@MyConditionProperties
@ConditionalOnProperty(
        prefix = "demo",
        name = "isopen",
        havingValue = "true",
        matchIfMissing = true
)
public class DemoServiceAutoConfiguration {
    @Autowired
    DemoProperties demoProperties;

    @Bean
    public DemoService helloService() {
        DemoService demoService = new DemoService();
        demoService.setHelloProperties(demoProperties);
        return demoService;
    }


}
