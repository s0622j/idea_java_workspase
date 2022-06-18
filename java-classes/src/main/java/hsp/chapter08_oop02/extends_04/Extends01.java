package hsp.chapter08_oop02.extends_04;

public class Extends01 {
    public static void main(String[] args) {
        Pupil_01 pupil = new Pupil_01();
        pupil.name = "银角大王";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("=======");
        Graduate_01 graduate = new Graduate_01();
        graduate.name = "金角大王";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
