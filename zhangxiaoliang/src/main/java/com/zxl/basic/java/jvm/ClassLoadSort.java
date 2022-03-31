package com.zxl.basic.java.jvm;

/**
 * @author :zhangxiaoliang
 * @date :2022/2/28 15:01
 * 子类父类加载顺序
 *
 */
public class ClassLoadSort {
    public static void main(String[] args) {
        //Father father = new Father();
        Son son = new Son();
    }
}
class Father{
    private static int a;

    public Father() {
        System.out.println("father构造函数");
    }
    {
        System.out.println("father代码块");
    }
    static {
        System.out.println("father静态代码块");
    }

}
class Son extends Father{
    public Son() {
        System.out.println("son构造函数");
    }
    static {
        System.out.println("son静态代码块");
    }
    {
        System.out.println("son代码块");
    }
}
