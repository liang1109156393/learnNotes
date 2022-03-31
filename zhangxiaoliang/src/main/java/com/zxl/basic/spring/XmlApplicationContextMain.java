package com.zxl.basic.spring;

import com.zxl.basic.spring.bean.InjectMyBean;
import com.zxl.basic.spring.bean.MyBean;
import com.zxl.basic.spring.config.MyConfig2;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 13:51
 */
public class XmlApplicationContextMain {
    public static void main(String[] args) {
        String beanXml = "classpath:applicationContext.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(beanXml);
        MyBean xmlMyBean = (MyBean) classPathXmlApplicationContext.getBean("myBean");
        xmlMyBean.testMyBean();

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig2.class);
        MyBean myBean = (MyBean) annotationConfigApplicationContext.getBean("myBean3");
        myBean.testMyBean();

        InjectMyBean injectMyBean = (InjectMyBean) annotationConfigApplicationContext.getBean("injectBean");
        InjectMyBean injectMyBean2 = (InjectMyBean) annotationConfigApplicationContext.getBean("injectBean2");
        injectMyBean.testInjectBean();
        injectMyBean2.testInjectBean();

    }
}
