package hsp.chapter10_oop03.interface_07;

public class InterfaceExercise02_11 {
    public static void main(String[] args) {

    }
}


interface AAAAA {  // 1min 看看
    int x = 0;
}  //想到 等价 public static final int x = 0;

class BBBBB {
    int x = 1;
} //普通属性

class CCCCC extends BBBBB implements AAAAA {
    public void pX() {
        //System.out.println(x); //错误，原因不明确x
        //可以明确的指定x
        //访问接口的 x 就使用 AAAAA.x
        //访问父类的 x 就使用 super.x
        System.out.println(AAAAA.x + " " + super.x);
    }

    public static void main(String[] args) {
        new CCCCC().pX();
    }
}