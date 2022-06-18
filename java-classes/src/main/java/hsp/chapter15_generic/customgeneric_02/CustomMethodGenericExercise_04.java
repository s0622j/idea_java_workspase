package hsp.chapter15_generic.customgeneric_02;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName CustomMethodGenericExercise_04.java
 * @Description TODO
 * @createTime 2022-04-01 14:41:00
 */
public class CustomMethodGenericExercise_04 {
    public static void main(String[] args) {
        //T->String, R->Integer, M->Double
        Apple<String, Integer, Double> apple = new Apple<>();
        apple.fly(10);//10 会被自动装箱 Integer10, 输出Integer
        apple.fly(new Dog());//Dog

    }
}

class Apple<T, R, M> {//自定义泛型类

    public <E> void fly(E e) {  //泛型方法
        System.out.println(e.getClass().getSimpleName());
    }

    //public void eat(U u) {}//错误，因为U没有声明
    public void run(M m) {
    } //ok
}

class Dog {
}