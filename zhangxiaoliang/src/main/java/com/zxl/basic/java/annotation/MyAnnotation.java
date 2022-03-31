package com.zxl.basic.java.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/23 21:50
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotation {
    String name() default "zxl";

    int age() default 12;

    /** @Target 类、接口、枚举、注解上面 TYPE,
    字段上 FIELD,
    方法上 METHOD,
    方法的参数上 PARAMETER,
    构造函数上 CONSTRUCTOR,
    本地变量上 LOCAL_VARIABLE,
    注解上  ANNOTATION_TYPE,
    包上 PACKAGE,
    类型参数上 TYPE_PARAMETER,
    类型名称上 TYPE_USE
     **/
    /*@Inherit 类继承,接口实现不可获得接口上的注解
     * @Repeatable重复使用注解
     *
     * */
}

class UseAnnotation7<@MyAnnotation(name = "T0是在类上声明的一个泛型类型变量") T0, @MyAnnotation(name = "T1是在类上声明的一个泛型类型变量") T1> {

    public <@MyAnnotation(name = "T2是在方法上声明的泛型类型变量") T2> void m1() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        for (TypeVariable typeVariable : UseAnnotation7.class.getTypeParameters()) {
            print(typeVariable);
        }

        for (TypeVariable typeVariable : UseAnnotation7.class.getDeclaredMethod("m1").getTypeParameters()) {
            print(typeVariable);
        }
    }

    private static void print(TypeVariable typeVariable) {
        System.out.println("类型变量名称:" + typeVariable.getName());
        Arrays.stream(typeVariable.getAnnotations()).forEach(System.out::println);
    }
}

@MyAnnotation(name = "用在了类上")
class UserAnnotation10<@MyAnnotation(name = "用在了类变量类型V1上") V1, @MyAnnotation(name = "用在了类变量类型V2上") V2> {

    private Map<@MyAnnotation(name = "用在了泛型类型上") String, Integer> map;

    public <@MyAnnotation(name = "用在了参数上") T> String m1(String name) {
        return null;
    }
}

/**重复注解*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@interface Ann12s {
    Ann12[] value(); //@1
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Repeatable(Ann12s.class)//@2
@interface Ann12 {
    String name();
}


/*spring中自定义注解,可以使用别名 指定@Component的属性*/
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component //@1
 @interface MyBean {
    @AliasFor(annotation = Component.class) //@2
    String value() default ""; //@3
}




@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@A1
@interface B1 { //@1
    String value() default "b";//@2
    @AliasFor( value = "value",annotation = A1.class) //@5
    String a14Value();
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface A1 {
    String value() default "a";
}

@B1(value = "路人甲Java",a14Value = "ssss")
 class UseAnnotation13 {

    public static void main(String[] args) {
        //AnnotatedElementUtils是spring提供的一个查找注解的工具类
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation13.class, B1.class));
        System.out.println(AnnotatedElementUtils.getMergedAnnotation(UseAnnotation13.class, A1.class));
    }


}
