package hsp.chapter08_oop02.modifier_02;

public class Test {
    public static void main(String[] args) {
        A a = new A ();
        a.m1();
        B b = new B();
        b.say();
    }
}

//只有 默认和public 可以修饰类
class Tiger{ }