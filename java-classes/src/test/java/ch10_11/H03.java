package ch10_11;

/**
 * @author shenjie
 * @version 1.0
 */
public class H03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}

abstract class Animal{
    abstract void shout();
}

class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("喵喵喵");
    }
}

class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("汪汪汪");
    }
}