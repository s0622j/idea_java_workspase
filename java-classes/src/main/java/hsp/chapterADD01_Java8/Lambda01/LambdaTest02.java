package hsp.chapterADD01_Java8.Lambda01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Lambda02.java
 * @Description TODO
 * @createTime 2022-05-24 10:29:00
 */
public class LambdaTest02 {
    /**
     *
     * Lambda表达式的使用
     * 1.举例：(o1,o2) -> Integer.compare(o1,o2);
     * 2.格式:
     *     -> :Lamabd操作符 或 箭头操作符
     *     -> 左边：Lambda形参列表（其实就是接口中的抽象方法的形参列表）
     *     -> 有表：Lambda体 （其实就是重写的抽象方法的方法体）
     *
     * 3.Lambda表达式的使用：（分为6中情况介绍）
     *   总结：
     *   -> 左边：lambda形参列表的参数类型可以省略（类型推断）；如果lambda形参列表只有一个参数，其一堆（）也可以省略
     *   -> 右边：lambda体应该使用一对{}包裹；如果lambda体只有一条执行语句（可能是return语句），可以省略一对{}和return
     *
     * 4.Lambda表达式的本质：作为函数式接口的实例
     *
     * 5.如果一个接口中，只声明了一个抽象方法，则此接口就称为函数式接口
     *
     */

    //语法格式一：无参，无返回值

    @Test
    public void test01(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("aabbcc");
            }
        };

        r1.run();


        System.out.println("**********************************");

        Runnable r2 = () -> {
            System.out.println("我爱北京故宫");
        };
        r2.run();

    }

    //语法格式二：Lambda需要一个参数，但没有返回值
    @Test
    public void test02(){

        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别是什么？");

        System.out.println("********************************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("一个是听的人当真了，一个说的人当真了");

    }

    //语法格式三：数据类型可以省略，因为可由编译器推断得出，称为“类型推断”
    @Test
    public void test03(){
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };

        con1.accept("一个是听的人当真了，一个说的人当真了");

        System.out.println("********************************");

        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("一个是听的人当真了，一个说的人当真了");

    }

    @Test
    public void test04(){
        ArrayList<String> list = new ArrayList<>(); //类型推断
        int[] arr = new int[]{1,2,3};
        int[] ar2 = {1,2,3};
    }

    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test05(){
        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了，一个说的人当真了");

        System.out.println("********************************");

        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("一个是听的人当真了，一个说的人当真了");
    }

    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test06(){

        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                //return Integer.compare(o1,o2);
                return o1.compareTo(o2);
            }
        };

        System.out.println(com1.compare(12,21));

        System.out.println("********************************");

        Comparator<Integer> com2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(12,21));

    }

    //语法格式六：当Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test07(){

        Comparator<Integer> com2 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12,21));

    }


}
