package hsp.chapter11_enum.enum_01;

/**
 * @author shenjie
 * @version 1.0
 */
public class Enumeration02_02 {
    public static void main(String[] args) {
        System.out.println(Season_02.AUTUMN);
        System.out.println(Season_02.SPRING);
    }
}

//演示字定义枚举实现
class Season_02 {//类
    private String name;
    private String desc;//描述

    //定义了四个对象, 固定.
    public static final Season_02 SPRING = new Season_02("春天", "温暖");
    public static final Season_02 WINTER = new Season_02("冬天", "寒冷");
    public static final Season_02 AUTUMN = new Season_02("秋天", "凉爽");
    public static final Season_02 SUMMER = new Season_02("夏天", "炎热");


    //1. 将构造器私有化,目的防止 直接 new
    //2. 去掉setXxx方法, 防止属性被修改
    //3. 在Season 内部，直接创建固定的对象
    //4. 优化，可以加入 final 修饰符
    private Season_02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}