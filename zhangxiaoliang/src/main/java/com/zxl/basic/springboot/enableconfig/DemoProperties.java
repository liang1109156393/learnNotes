package com.zxl.basic.springboot.enableconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/7 19:57
 */
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {


    private String saywhat;
    private String towho;


    public String getSaywhat() {
        return saywhat;
    }

    public void setSaywhat(String saywhat) {
        this.saywhat = saywhat;
    }

    public String getTowho() {
        return towho;
    }

    public void setTowho(String towho) {
        this.towho = towho;
    }


}
