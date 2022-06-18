package test_02.H11;

public class H11 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();

        Person sss = (Person)s1;
//        Student pppp = (Student)p1;

        Person p2 = new Student();
        sss.run();
        p2.run();
        ((Student) p2).study();
        ((Student) sss).study();

    }
}

class Person{
    public void run(){
        System.out.println("p run");
    }

    public void eat(){
        System.out.println("p eat");
    }
}

class Student extends Person{
    public  void run(){
        System.out.println("s run");
    }

    public void study(){
        System.out.println("sssss ... ");
    }
}
