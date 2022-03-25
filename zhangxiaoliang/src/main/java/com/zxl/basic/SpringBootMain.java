package com.zxl.basic;

import com.zxl.basic.spring.Listener.MyEvent;
import com.zxl.basic.spring.Listener.MyListener;
import com.zxl.basic.spring.MyBeanNoConfig;
import com.zxl.basic.spring.NoConfig;
import com.zxl.basic.spring.intenal.inteface.MyApplicationInitializer;
import com.zxl.basic.spring.intenal.inteface.MyConfig;
import com.zxl.basic.spring.intenal.inteface.MyImportBeanDefinition;
import com.zxl.basic.spring.intenal.inteface.MyImportSelector;
import com.zxl.basic.spring.lifecycle.LifeCycle;
import com.zxl.basic.springboot.enableconfig.EnableDemoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/4 13:32
 */
@SpringBootApplication
@EnableDemoConfiguration
public class SpringBootMain {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootMain.class);
        application.addInitializers(new MyApplicationInitializer());
        application.addListeners(new MyListener());
        ConfigurableApplicationContext context = application.run(args);
        context.publishEvent(new MyEvent(""));


        MyConfig.ImportBean importBean = (MyConfig.ImportBean) context.getBean("importBean");
        importBean.testImport();
        MyImportSelector.ImportSelectorBean importSelectorBean = (  MyImportSelector.ImportSelectorBean) context.getBean(MyImportSelector.ImportSelectorBean.class);
        importSelectorBean.testImportSelectorBean();
        MyImportBeanDefinition.ImportBeanDefinitionBean importBeanDefinitionBean = ( MyImportBeanDefinition.ImportBeanDefinitionBean) context.getBean("importBeanDefinitionBean");
        importBeanDefinitionBean.testImportBeanDefinitionBean();
        LifeCycle lifeCycle =(LifeCycle) context.getBean("lifeCycle");
        lifeCycle.testAutoConfig();
        MyBeanNoConfig noConfig = (MyBeanNoConfig)context.getBean("myBeanNoConfig");
        noConfig.testNoConfig();

        System.out.println(context.getBean("myConfig").toString());
        System.out.println(context.getBean("noConfig").toString());

    }


}

