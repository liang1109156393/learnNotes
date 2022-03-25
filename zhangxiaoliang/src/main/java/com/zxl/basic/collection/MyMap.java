package com.zxl.basic.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/1 15:18
 * 1:HashMap:key value 底层数组、链表、红黑树数据结构，非线程安全，默认容量不指定为16，扩容为原来的2倍,key value 可为null key重复 value覆盖
 * 2:LinkedHashMap:HashMap基础上,维护一个双向链表,key value 可为null key重复 value覆盖
 * 3:TreeMap:底层红黑树 key 不可为null(key使用比较器)，value可为null
 * 4:HashTable:synchronized 线程安全的,底层数组、链表,key(hashCode) value不可为null,默认大小11,扩容为原来的2倍加一
 * 5:ConcurrentHashMap 线程安全，数组 链表 红黑树。key value都不为null synchronized
 */
public class MyMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null,null);
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<String, String>();
        stringStringLinkedHashMap.put(null,null);
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1",null);
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("123","123");

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("123","123");

    }
}
