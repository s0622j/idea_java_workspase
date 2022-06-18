package ch10_11;

/**
 * @author shenjie
 * @version 1.0
 */
public class H05 {
    public static void main(String[] args) {
     new A().BB();
     new A().show();
        System.out.println("hello world!");
    }
}

class A {
private String name = "aa";
    void BB(){
        class B{
            private  static final String NAME ="bb";
        }

        B b = new B();
        System.out.println(b.NAME);
    }
    void show(){
        System.out.println(this.name);
    }


}