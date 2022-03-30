package com.zxl.basic.collection;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author :zhangxiaoliang
 * @date :2022/3/1 10:32
 *
 * 快速失败:fast-fail add remove会改变modCount值,当遍历时候， modCount != expectedModCount
 * throw new ConcurrentModificationException();
 * 使用itr.remove避免fast-fail
 * <p>
 * 1、ArrayList:有序的、可重复的、非线程安全的、底层数组结构实现的,数组默认大小为10 扩容为原来的1.5倍
 * 2、Vector:有序的、可重复的、底层数组实现 线程安全的 底层数组，默认大小10，若指定扩容大小则使用扩容大小，否则扩容为原来的2倍
 * 3、LinkedList:有序的、可重复的、底层双向链表实现、非线程安全
 * 4、CopyOnWriteArrayList
 */
public class MyList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 1) {
                arrayList.remove(i);
        }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.add("111");
        copyOnWriteArrayList.add("a");
        copyOnWriteArrayList.get(1);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");

        Vector<String> vector = new Vector<>();
        vector.add("1");
        vector.add("1");
        vector.forEach(v-> System.out.println("vector = " + v));
    }


}
