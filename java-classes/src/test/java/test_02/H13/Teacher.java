package test_02.H13;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public String teach() {
        System.out.println("good teach!!!");
        return "good teach!!!";
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void show() {
        System.out.println("老师信息:" + "\n姓名：" + getName()
                + "\n年龄：" + getAge() + "\n性别：" + getSex() + "\n工龄" + this.work_age
                + "\n我承诺，" + this.teach() + "\n" + play());
    }
}
