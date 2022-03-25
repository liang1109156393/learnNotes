package com.zxl.basic.jvm;

/**
 * @author :zhangxiaoliang
 * @date :2022/2/28 19:04
 * java内存模型:
 * 1、线程私有的:程序计数器、虚拟机栈、本地方法栈
 * 2、线程共享的:堆、方法区
 *程序计数器:记录线程执行的行号。
 *虚拟机栈:由多个栈帧组成,包含操作数栈、局部变量表、动态链接、返回值
 *本地方法栈:原生的native修饰的方法。
 *堆:java对象存储区域
 *方法区:常量、类信息等。
 *
 *gc
 * gc算法:标记清楚算法、复制算法、标记整理、分代收集算法
 * gcroots对象:栈对象、常量对象、方法区对象等。
 * 如何判定一个对象是gc对象,根可达算法、引用计数法。
 * gc收集器:
 *
 *
 */
public class JavaJvm {
    public static void main(String[] args) {

    }
}
