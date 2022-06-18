package hsp.chapter15_generic.junit_03;


import org.junit.Test;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName junit_.java
 * @Description TODO
 * @createTime 2022-04-01 15:12:00
 */
public class junit_ {
    public static void main(String[] args) {
        //传统方式
        //new JUnit_().m1();
        //new JUnit_().m2();

    }


    @Test
    public void m1() {
        System.out.println("m1方法被调用");
    }

    @Test
    public void m2() {
        System.out.println("m2方法被调用");
    }

    @Test
    public void m3() {
        System.out.println("m3方法被调用");
    }
}
