package ch10_11;

/**
 * @author shenjie
 * @version 1.0
 */
public class H04 {
    public static void main(String[] args) {


        new Cellphone().testWork(new Calculator() {
            @Override
            public void work() {
                System.out.println("iii work");
            }
        });
    }
}

interface Calculator {
    void work();
}

class Cellphone  {

    public void testWork(Calculator calculator) {
        calculator.work();
        System.out.println("========");
    }

}