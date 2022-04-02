package com.zxl.basic.java.designpatterns.decorator;

/**
 * @author :zhangxiaoliang
 * @date :2022/4/1 14:16
 * 装饰器模式:在不改变原有的类的基础上，增加一些额外的职责功能
 */
public class DecoratorTest {
    public final  ConcreteComponent newInstance = new ConcreteComponent();
    public static void main(String[] args) {
        DecoratorTest a  = new DecoratorTest();
    }
}

interface Component {
    public void operation();
}

//具体构件角色
class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

//抽象装饰角色
class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

//具体装饰角色
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}