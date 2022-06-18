public class H07X {
    public static void main(String[] args) {
        H07_2 H = new H07_2(28, 3);
        System.out.println(H.he());
        System.out.println(H.jian());
        System.out.println(H.chen());
        System.out.println(H.chu());





        Cir c = new Cir(5);
        PassObject p = new PassObject();
        p.printAreas(c, 5);

    }

}


class H07_2 {
    double n1;
    double n2;

    public H07_2(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;

    }

    /*
 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，
 定义四个方法实现求和、差、乘、商(要求除数为0的话，要提示) 并创建两个对象，分别测试
 */
    public double he() {
        return this.n1 + this.n2;
    }

    public double jian() {
        return this.n1 - this.n2;
    }

    public double chen() {
        return this.n1 * this.n2;
    }

    public Double chu() {
        if (this.n2 == 0) {

            System.out.println("除数不能为0");
            return null;
        } else {
            return this.n1 / this.n2;
        }
    }

}

/*
义Music类，里面有音乐名name、音乐时长times属性，
并有播放play功能和返回本身属性信息的功能方法getInfo
 */

class Music {
    String name;
    int times;

    public Music(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public void play() {
        System.out.println("播放");
    }

    public String getInfo() {
        return this.name + this.times;
    }
}

/*
创建一个Employee类，
属性有(名字，性别，年龄，职位，薪水)， 提供3个构造方法，可以初始化
(1) (名字，性别，年龄，职位，薪水),
(2) (名字，性别，年龄) (3) (职位，薪水), 要求充分复用构造器
 */

class emp {
    String name;
    char sex;
    int age;
    String job;
    double sel;

    public emp(String job, double sel) {
        this.job = job;
        this.sel = sel;
    }

    public emp(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public emp(String name, char sex, int age, String job, double sel) {
        this(name, sex, age);
        this.job = job;
        this.sel = sel;
    }
}



/*
题目要求：
(1) 定义一个Circle类，包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积。
(2) 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
     public void printAreas(Circle c, int times) 	//方法签名/声明
(3) 在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
(4) 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示

 */

class Cir {
    double r;

    public Cir(double r) {
        this.r = r;
    }

    public double findArea() {
        return Math.PI * this.r * this.r;
    }
}

class PassObject {
    public void printAreas(Cir c, int times) {
        for (int i = 1; i <= times; i++) {
            c.r = i;
            c.findArea();

            System.out.println("半径：" + (double) i + "\t\t\t\t\t\t" + "面积：" + c.findArea());
        }

    }
}