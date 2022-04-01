package com.zxl.basic.java.designpatterns.adappter;

/**
 * @author :zhangxiaoliang
 * @date :2022/4/1 13:26
 * 适配器模式,提供目标需要的接口对象 springmvc中。
 */
public class Adappter {
    public static void main(String[] args) {

    }
}

interface Component {
    public void component();
}

class ClassAdaptee {
    public void classAdaptee() {
        System.out.println("类适配器");
    }
}

class ClassAdapter extends ClassAdaptee implements Component {
    @Override
    public void component() {
        classAdaptee();
    }
}

class ObjectAdapter implements Component {
    private ClassAdaptee classAdaptee;

    public ObjectAdapter(ClassAdaptee classAdaptee) {
        this.classAdaptee = classAdaptee;
    }

    @Override
    public void component() {
        classAdaptee.classAdaptee();
    }
}