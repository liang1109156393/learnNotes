package com.zxl.basic.spring.intenal.inteface;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 16:45
 */
@Component
public class MyImportBeanDefinition implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition beanDe = BeanDefinitionBuilder.rootBeanDefinition(ImportBeanDefinitionBean.class).getBeanDefinition();
        registry.registerBeanDefinition("importBeanDefinitionBean", beanDe);
    }

    public class ImportBeanDefinitionBean {
        public void testImportBeanDefinitionBean() {
            System.out.println("testImportBeanDefinitionBean----------------");
        }
    }
}


