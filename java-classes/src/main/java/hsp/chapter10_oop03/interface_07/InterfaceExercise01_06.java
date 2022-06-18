package hsp.chapter10_oop03.interface_07;

public class InterfaceExercise01_06 {
    public static void main(String[] args) {
        BB b = new BB();//ok
        System.out.println(b.a);  //23
        System.out.println(AA.a);  //23
        System.out.println(BB.a);  //23
    }
}

interface AA {
    int a = 23; //等价 public static final int a = 23;
}

class BB implements AA {//正确
}
