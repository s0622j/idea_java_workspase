package test_02.H13;

public class Student extends Person {
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String study() {
        System.out.println("good good study!!");
        return "good good study!!";
    }

    @Override
    public String play() {
        return super.play() + "是足球";
    }

    public void show() {
        System.out.println("学生信息:" + "\n姓名：" + getName()
                + "\n年龄：" + getAge() + "\n性别：" + getSex() + "\n学号" + this.stu_id
                + "\n我承诺，" + this.study() + "\n" + play());
    }
}
