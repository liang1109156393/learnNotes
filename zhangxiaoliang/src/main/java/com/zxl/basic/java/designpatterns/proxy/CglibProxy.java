package com.zxl.basic.java.designpatterns.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/31 14:22
 */
public class CglibProxy {
    public static void main(String[] args) {
        //创建目标类对象
        //自定拦截
        CglibInterceptor customizeMethodInterceptor = new CglibInterceptor();
        CglibInterface instance = (CglibInterface) customizeMethodInterceptor.getInstance(CglibInterface.class);
        instance.queryInfo();
    }
}

class CglibInterceptor implements MethodInterceptor {
    //创建代理对象
    public Object getInstance(Class<?> supperClass) {
        Enhancer enhancer = new Enhancer();
        //指定需要创建子类的父类
        enhancer.setSuperclass(supperClass);
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] paramArr, MethodProxy methodProxy) throws Throwable {
        System.out.println("transaction begin...");
        //执行方法,调的是父类的方法，代理对象是目标对象的子类
        methodProxy.invokeSuper(obj, paramArr);
        System.out.println("transaction end...");
        return null;
    }
}

class CglibSubject {
    public void queryInfo(int id) {
        System.out.println("根据ID查询信息。。。 " + id);
    }

    public final void updateInfo(int id, String name) {
        System.out.println("根据ID和名称更新信息 。。。" + id);
    }
}

interface CglibInterface {
    void queryInfo();

    void updateInfo(int id, String name);
}

class CglibSubjectImpl implements CglibInterface {

    @Override
    public void queryInfo() {
        System.out.println("根据ID查询信息。。。 ");
    }

    @Override
    public void updateInfo(int id, String name) {
        System.out.println("根据ID和名称更新信息 。。。" + id);
    }
}