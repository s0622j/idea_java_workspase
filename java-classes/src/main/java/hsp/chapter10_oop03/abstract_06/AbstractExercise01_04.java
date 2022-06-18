package hsp.chapter10_oop03.abstract_06;

public class AbstractExercise01_04 {
    public static void main(String[] args) {
        //测试
        Manager jack = new Manager("jack", 999, 50000);
        jack.setBonus(8000);
        jack.work();

        CommonEmployee tom = new CommonEmployee("tom", 888, 20000);
        tom.work();
    }
}
