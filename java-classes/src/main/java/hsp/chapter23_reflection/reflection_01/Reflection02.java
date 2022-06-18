package hsp.chapter23_reflection.reflection_01;

import hsp.chapter23_reflection.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Reflection02.java
 * @Description TODO 测试反射调用的性能，和优化方案
 * @createTime 2022-04-18 16:28:00
 */
public class Reflection02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Field
        //Method
        //Constructor
        m1();
        m2();
        m3();
    }

    //传统方法来调用hi
    public static void m1() {

        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1() 耗时=" + (end - start));
    }

    //反射机制调用方法hi
    public static void m2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class cls = Class.forName("hsp.chapter23_reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("m2() 耗时=" + (end - start));
    }

    //反射调用优化 + 关闭访问检查

    public static void m3() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class cls = Class.forName("hsp.chapter23_reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);//反射调用方法
        }
        long end = System.currentTimeMillis();
        System.out.println("m3() 耗时=" + (end - start));
    }
}
