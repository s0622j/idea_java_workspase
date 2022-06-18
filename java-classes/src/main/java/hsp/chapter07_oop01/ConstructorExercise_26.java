package hsp.chapter07_oop01;

public class ConstructorExercise_26 {
    //编写一个main方法
    public static void main(String[] args) {
        Person5 p1 = new Person5();//无参构造器

        //下面输出 name = null, age = 18
        System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);

        Person5 p2 = new Person5("scott", 50);
        //下面输出 name = scott, age = 50
        System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);

    }
}

/**
 * 在前面定义的Person类中添加两个构造器:
 * 第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
 * 第二个带pName和pAge两个参数的构造器：
 * 使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 * 分别使用不同的构造器，创建对象.
 */

class Person5 {
    String name;//默认值 null
    int age;//默认 0
    //第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
    public Person5() {
        age = 18;//
    }
    //第二个带pName和pAge两个参数的构造器
    public Person5(String pName, int pAge) {
        name = pName;
        age = pAge;
    }
}