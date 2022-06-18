package hsp.chapter08_oop02.extends_04.exercise_03;

public class NotePad extends Computer {

    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo2() {
        System.out.println("PC信息=");
        //调用父类的getDetails方法，得到相关属性信息..
        System.out.println(getDetails() + " color=" + this.color);
    }
}

