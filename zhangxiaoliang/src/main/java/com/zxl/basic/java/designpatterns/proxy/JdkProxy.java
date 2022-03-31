package com.zxl.basic.java.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/31 13:40
 */
interface Subject {
    public void testSubject();
}

class SubjectImpl implements Subject {
    @Override
    public void testSubject() {
        System.out.println("======================");
    }
}

class MyInvocationHandler implements InvocationHandler {
    public Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object createProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}

public class JdkProxy {
    /**
     * jdk代理只能为接口做代理,java中只能单继承，代理类已经继承了proxy 不能再继承目标类
     * $Proxy0 extends Proxy implements Subject
     * 调用代理类的目标方法，实际上是调用invocation的invoke方法。
     *
     */
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject proxy = (Subject) new MyInvocationHandler(new SubjectImpl()).createProxy();
        proxy.testSubject();
        System.out.println("$Proxy0.class全名: " + Proxy.getProxyClass(Subject.class.getClassLoader(), Subject.class));
    }
}