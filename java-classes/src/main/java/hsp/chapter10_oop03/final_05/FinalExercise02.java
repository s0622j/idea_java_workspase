package hsp.chapter10_oop03.final_05;

public class FinalExercise02 {

    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println(new Something().addOne(5));
    }
}

class Something {  //FinalExercise02.java
    public int addOne(final int x) { //下面的代码是否有误，为什么? 1min
        //++x;  //错误,原因是不能修改 final x的值
        return x + 1; //这里是可以.
    }
}
