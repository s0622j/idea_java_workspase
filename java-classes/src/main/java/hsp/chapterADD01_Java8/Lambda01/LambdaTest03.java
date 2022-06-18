package hsp.chapterADD01_Java8.Lambda01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName LambdaTest03.java
 * @Description TODO
 * @createTime 2022-05-26 13:24:00
 */
public class LambdaTest03 {
    /**
     *
     * java内置的4大核心函数式接口
     *
     * 消费型接口 Consumer<T> void accept(T t)
     * 供给型接口 Supplier<T> T get()
     * 函数式接口 Function<T,R> R apply(T t)
     * 断定型接口 Predicate<T> boolean test(T t)
     *
     */

    @Test
    public void test01(){

        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("买瓶矿泉水，价格为：" + aDouble);
            }
        });

        System.out.println("*************************************");

        happyTime(200, money -> System.out.println("买瓶矿泉水，价格为：" + money));

    }

    public void happyTime (double money, Consumer<Double> con){
        con.accept(money);
    }


    @Test
    public void test02(){
        List<String> list = Arrays.asList("北京","南京","天津","东京","西京","普京");
        List<String> l2 = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(l2);
        System.out.println("*************************************");
        List<String> l3 = filterString(list, s -> s.contains("京"));
        System.out.println(l3);
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list , Predicate<String> pre){

        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }




}
