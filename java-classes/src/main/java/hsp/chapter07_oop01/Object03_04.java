package hsp.chapter07_oop01;

public class Object03_04 {
    //编写一个main方法
    public static void main(String[] args) {

        Person2 p1=new Person2();
        p1.age=10;
        p1.name="小明";
        Person2 p2=p1; //把p1 赋给了 p2 ， 让p2指向p1
        //p1.age = 70;
        //p2 = null;  // NullPointerException
        System.out.println(p1.age); // 10
        System.out.println(p2.age); // 10




    }
}

class Person2 {
    String name;
    int age;
}