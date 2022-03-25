package com.zxl.basic.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/1 14:50
 * Set集合:无序的，不可重复的，线程不安全的,
 * 1、HashSet底层HashMap实现的
 * 2、LinkedHashSet底层LinkedHashMap实现,按加入结合有序
 * 3、TreeSet底层TreeMap实现,实现排序规则。
 * */
public class MySet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.forEach(System.out::println);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.forEach(System.out::println);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("d");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.forEach(System.out::println);
    }
}
