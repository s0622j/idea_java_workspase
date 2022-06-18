package test_02;


/**
 * @author shenjie
 * @version 1.0
 */
public class EnumDemo {
    public static void main(String[] args) {
        Week2[] weeks = Week2.values();
        for(Week2 w : weeks){
            System.out.println(w.getName());
        }
    }
}


/*
声明Week枚举类，其中包含星期一至星期日的定义；
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
使用values 返回所有的枚举数组, 并遍历 , 输出左图效果

 */

enum Week2{
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String name;

     Week2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}