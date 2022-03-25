package com.zxl.basic.jvm;

/**
 * @author :zhangxiaoliang
 * @date :2022/2/28 15:09
 * 类加载器:双亲委派机制,自定义类加载器、应用程序、扩展类加载器、bootstrap类加载器
 * 加载顺序:加载->连接(验证、准备、解析)->初始化->使用->销毁
 * 加载:将class文件加载到jvm虚拟中,比如new、class.forName("")、
 * 链接:验证字节码文件是否可用,初始化复制,static int a=1 ,设置初始值为0 ,初始化时才会真正赋值为1,符号引用变成直接引用。
 * 初始化；初始化赋值
 * 双亲委派机制优缺点:避免重复加载 + 避免核心类篡改,缺点:单向加载， 即顶层的
 * ClassLoader无法访问底层的 ClassLoader 所加载的类
 */
public class ClassLoad extends ClassLoader{
    public static void main(String[] args) {

    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
