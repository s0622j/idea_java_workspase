package hsp.chapter08_oop02.test_00.use;

import hsp.chapter08_oop02.test_00.xiaoqiang.Dog;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog); // Dog@1540e19d

        hsp.chapter08_oop02.test_00.xiaoming.Dog dog1 = new hsp.chapter08_oop02.test_00.xiaoming.Dog();
        System.out.println(dog1);  // Dog@677327b6

        System.out.println(Math.abs(-1));
    }
}
