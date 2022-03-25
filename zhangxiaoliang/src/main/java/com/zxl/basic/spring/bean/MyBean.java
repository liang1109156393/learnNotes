package com.zxl.basic.spring.bean;

import static java.lang.System.out;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 13:48
 */
public class MyBean {
    private String name ;
    private Integer age ;

    public MyBean(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void testMyBean(){
        out.println("name:"+this.name+"age:"+this.age);
        out.println("myBeanTest ================");
    }

}
