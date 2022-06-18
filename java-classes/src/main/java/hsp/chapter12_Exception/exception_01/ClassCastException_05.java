package hsp.chapter12_Exception.exception_01;

/**
 * @author shenjie
 * @version 1.0
 */
public class ClassCastException_05 {
    public static void main(String[] args) {
        A b = new B(); //向上转型
        B b2 = (B)b;//向下转型，这里是OK
        C c2 = (C)b;//这里抛出ClassCastException
    }
}

class A {}
class B extends A {}
class C extends A {}