package test_02;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println("================================");
        Teacher t1 = new Teacher("li", 19, "体育", 2000);
        Pro t2 = new Pro("li", 19, "体育", 2000);
        FuPro t3 = new FuPro("li", 19, "体育", 2000);
        PuPro t4 = new PuPro("li", 19, "体育", 2000);
        t1.introduce();
        System.out.println("================================");
        t2.introduce();
        System.out.println("================================");
        t3.introduce();
        System.out.println("================================");
        t4.introduce();
    }
}


class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
//        this.salary = salary;
        setSalary(salary);
        this.salary = getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("name:" + getName() + "\nage:" + getAge() + "\npost:" + getPost() + "\nsalary:" + getSalary());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Pro extends Teacher{
    public Pro(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary*1.3);
    }
}

class FuPro extends Teacher{
    public FuPro(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary*1.2);
    }
}

class PuPro extends Teacher{
    public PuPro(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary*1.1);
    }
}
