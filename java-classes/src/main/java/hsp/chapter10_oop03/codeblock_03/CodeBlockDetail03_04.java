package hsp.chapter10_oop03.codeblock_03;

public class CodeBlockDetail03_04 {
    public static void main(String[] args) {
        new BBB();//(1)AAA的普通代码块(2)AAA() 构造器被调用(3)BBB的普通代码块(4)BBB() 构造器被调用
    }
}

class AAA { //父类Object
    {
        System.out.println("AAA的普通代码块");
    }
    public AAA() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("AAA() 构造器被调用....");
    }
}

class BBB extends AAA  {
    {
        System.out.println("BBB的普通代码块...");
    }
    public BBB() {
        //(1)super()
        //(2)调用本类的普通代码块
        System.out.println("BBB() 构造器被调用....");
    }
}

//todo 顺序就是父类静态——》子类静态——》父类普通——》父类构造器——》子类普通——》子类构造器！