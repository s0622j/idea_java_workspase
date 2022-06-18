package hsp.chapter10_oop03.static_01;

public class StaticExercise03_08 {
}

class Person_02 { //StaticExercise03.java 2min 看
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
        // this.total = total;//错误，因为在static方法中，不可以使用this 关键字

        Person_02.total = total;
    }
    public Person_02() {//构造器
        total++;
        id = total;
    }
    //编写一个方法，输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }
}
class TestPerson2 {
    public static void main(String[] args) {

        Person_02.setTotalPerson(3);
        new Person_02(); //最后 total的值就是4
        Person_02.m();//看看输出的是不是4
    }
}

// todo 1、静态方法，只能访问静态成员
// todo 2、非静态方法，可以访问所有的成员
// todo 3、在编写代码时，任然要遵守访问权限规则