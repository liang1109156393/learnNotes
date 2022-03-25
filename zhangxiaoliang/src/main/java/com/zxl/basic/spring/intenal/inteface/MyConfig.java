package com.zxl.basic.spring.intenal.inteface;

import com.zxl.basic.springboot.enableconfig.DemoServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 16:50
 */
@Configuration
@Import({MyImportSelector.class,MyImportBeanDefinition.class})
public class MyConfig {
    /*  @Bean(value = "my",initMethod = "init")
    @Bean 注解只与方法名有关，若有别名，别名优先*/
    @Bean
    public ImportBean importBean() {
        return new ImportBean();
    }

   public class ImportBean {
        public void testImport() {
            System.out.println("testImportBean==============");
        }
    }
}


