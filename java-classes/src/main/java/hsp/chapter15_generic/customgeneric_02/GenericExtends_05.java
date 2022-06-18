package hsp.chapter15_generic.customgeneric_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName GenericExtends_05.java
 * @Description TODO
 * @createTime 2022-04-01 14:59:00
 */
public class GenericExtends_05 {

    public static void main(String[] args) {

        Object o = new String("xx");

        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();

        //举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();

        //如果是 List<?> c ，可以接受任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AAA> c： 表示 上限，可以接受 AAA或者AAA子类
//        printCollection2(list1);//×
//        printCollection2(list2);//×
        printCollection2(list3);//√
        printCollection2(list4);//√
        printCollection2(list5);//√

        //List<? super AAA> c: 支持AAA类以及AAA类的父类，不限于直接父类
        printCollection3(list1);//√
        //printCollection3(list2);//×
        printCollection3(list3);//√
        //printCollection3(list4);//×
        //printCollection3(list5);//×


        //冒泡排序

        //插入排序

        //....


    }
    // ? extends AA 表示 上限，可以接受 AA或者AA子类
    public static void printCollection2(List<? extends AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //说明: List<?> 表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> c) {
        for (Object object : c) { // 通配符，取出时，就是Object
            System.out.println(object);
        }
    }



    // ? super 子类类名AA:支持AA类以及AA类的父类，不限于直接父类，
    //规定了泛型的下限
    public static void printCollection3(List<? super AAA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}

class AAA {
}

class BBB extends AAA {
}

class CCC extends BBB {
}