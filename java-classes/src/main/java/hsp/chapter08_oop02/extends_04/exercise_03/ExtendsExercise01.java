package hsp.chapter08_oop02.extends_04.exercise_03;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        BB b = new BB();//a , b name, b
    }
}


class AA {
    AA() {
        System.out.println("a");
    }

    AA(String name) {
        System.out.println("a name");
    }
}

class BB extends AA {
    BB() {
        this("abc");
        System.out.println("b");
    }

    BB(String name) {
        //默认有 super();
        System.out.println("b name");
    }
}