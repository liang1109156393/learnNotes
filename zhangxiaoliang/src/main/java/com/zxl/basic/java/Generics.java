package com.zxl.basic.java;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/29 10:12
 * java中的泛型
 */
public class Generics {
    static {
        System.out.println("111111111");
    }

    public static void main(String[] args) {
        String a = "a \n "+"aaaa"+"\t" +"\r"+"bb"+"\n";
        String s = a.replaceAll("[\\n|\\r]", "");
        System.out.println("==================="+a);
    }
}
