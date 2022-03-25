package com.zxl.basic.springboot.enableconfig;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 19:59
 */
public class DemoService {
    DemoProperties demoProperties;

    public DemoProperties getHelloProperties() {
        return demoProperties;
    }

    public void setHelloProperties(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    public String sayHello(String name){
        return demoProperties.getTowho()+"-"+name+ demoProperties.getSaywhat();
    }
}
