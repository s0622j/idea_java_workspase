package hsp.chapter10_oop03.interface_07;

public class Interface02_02 {
    public static void main(String[] args) {
        System.out.println("hello world!");
    }
}


//老韩解读
//1.如果一个类 implements实现 接口
//2. 需要将该接口的所有抽象方法都实现
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("hi()....");
    }
}