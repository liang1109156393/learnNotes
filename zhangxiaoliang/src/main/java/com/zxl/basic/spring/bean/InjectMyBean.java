package com.zxl.basic.spring.bean;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 14:54
 */
public class InjectMyBean {
    private MyBean myBean;
    public InjectMyBean(){

    }

    public InjectMyBean(MyBean myBean) {
        this.myBean = myBean;
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }
    public void testInjectBean(){
        System.out.println("injectBean=============="+myBean.toString());
    }
}
