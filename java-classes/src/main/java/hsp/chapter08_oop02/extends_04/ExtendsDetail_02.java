package hsp.chapter08_oop02.extends_04;

public class ExtendsDetail_02 {
    public static void main(String[] args) {
        System.out.println("===第1个对象====");
        Sub_02 sub = new Sub_02(); //创建了子类对象 sub
        System.out.println("===第2个对象====");
        Sub_02 sub2 = new Sub_02("jack"); //创建了子类对象 sub2
        System.out.println("===第3对象====");
        Sub_02 sub3 = new Sub_02("king", 10); //创建了子类对象 sub2
        sub.sayOk();
    }
}
