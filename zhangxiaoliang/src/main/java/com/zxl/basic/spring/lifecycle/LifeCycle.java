package com.zxl.basic.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/4 10:00
 * spring 加载bean的beanDefinition到spring容器中
 * 调用BeanFactory处理器
 * BeanDefinitionRegistryPostProcessor优先级(内部的,PriorityOrdered,Ordered,无顺序的)
 * BeanFactoryPostProcessor优先级(内部的,PriorityOrdered,Ordered,无顺序的)
 * 注入:BeanPostProcessor(PriorityOrdered,Ordered,无顺序的)
 * getBean->doGetBean(getSingleton(String beanName):使用接口函数)->createBean->doCreateBean->createBeanInstance实例bean
 * ->addSingletonFactory(beanName, () -> getEarlyBeanReference(beanName, mbd, bean)); 加入到三级缓存
 * ->	populateBean(beanName, mbd, instanceWrapper); 循环依赖的地方
 * ->	exposedObject = initializeBean(beanName, exposedObject, mbd);
 * <p>
 * <p>
 * <p>
 * 三级缓存循环依赖(三级map):一级缓存singletonObjects、二级缓存earlySingletonObjects和 三级缓存singletonFactory
 * 使用二级缓存可以解决循环依赖问题，前提是对象没有aop代理。getEarlyBeanReference()产生代理对象
 */
@Component
public class LifeCycle implements BeanDefinitionRegistryPostProcessor, InstantiationAwareBeanPostProcessor, BeanPostProcessor, ApplicationContextAware, InitializingBean, DisposableBean {
    private ApplicationContext applicationContext;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("lifeCycle postProcessBeanDefinitionRegistry");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("lifeCycle postProcessBeanFactory");

    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("lifeCycle".equals(beanName)) {
            System.out.println("lifeCycle postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("lifeCycle".equals(beanName)) {
            System.out.println("lifeCycle postProcessAfterInitialization");
        }
        return bean;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("lifeCycle setApplicationContext");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("lifeCycle afterPropertiesSet");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("lifeCycle destroy");

    }

    public void testAutoConfig() {
    }

    public static void main(String[] args) {

    }

    /*实例化 默认返回null,若返回值不为null 则直接则不在进行下面的初始化操作*/
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    /*默认发挥true,若返回false 则跳过属性填充，执行后面的初始化*/
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        return InstantiationAwareBeanPostProcessor.super.postProcessPropertyValues(pvs, pds, bean, beanName);
    }
}
