package hsp.chapter08_oop02.poly_07.detail_03;

public class PolyExercise02_04 {
    public static void main(String[] args) {
        SubXX s = new SubXX();
        System.out.println(s.count);//20
        s.display();//20
        BaseXX b = s;
        System.out.println(b == s);//T
        System.out.println(b.count);//10
        b.display();//20
    }
}

class BaseXX {//父类
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class SubXX extends BaseXX {//子类
    int count = 20;

    public void display() {
        System.out.println(this.count);
    }
}