package hsp.chapter10_oop03.static_01;

public class StaticExercise01_06 {
}


class Test {
    static int count = 9;
    public void count() {
        System.out.println("count=" + (count++));
    }
    public static void main(String args[]) {
        new Test().count(); //9
        new Test().count(); //10
        System.out.println(Test.count);	//11
    }
}