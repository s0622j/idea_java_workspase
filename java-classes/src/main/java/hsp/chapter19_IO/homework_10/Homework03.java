package hsp.chapter19_IO.homework_10;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Homework03.java
 * @Description TODO
 * @createTime 2022-04-12 16:47:00
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        /**
         * (1) 要编写一个dog.properties   name=tom age=5 color=red
         * (2) 编写Dog 类(name,age,color)  创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化, 并输出
         * (3) 将创建的Dog 对象 ，序列化到 文件 e:\\dog.dat 文件
         */
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + ""; //Object -> String
        int age = Integer.parseInt(properties.get("age") + "");// Object -> int
        String color = properties.get("color") + "";//Object -> String

        Dog dog = new Dog(name, age, color);
        System.out.println("===dog对象信息====");
        System.out.println(dog);

        //将创建的Dog 对象 ，序列化到 文件 dog.dat 文件
        String serFilePath = "e:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        //关闭流
        oos.close();
        System.out.println("dog对象，序列化完成...");





        /**
         * (1) 要编写一个dog.properties   name=tom age=5 color=red
         * (2) 编写Dog 类(name,age,color)  创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化, 并输出
         * (3) 将创建的Dog 对象 ，序列化到 文件 e:\\dog.dat 文件
         */
//        Properties properties = new Properties();
//        properties.setProperty("charset", "utf8");
//        properties.setProperty("name","tom");
//        properties.setProperty("名称","汤姆");
//        properties.setProperty("age","5");
//        properties.setProperty("color","red");
//
//        properties.store(new FileWriter("src\\dog2.properties"), "xxx注释");
//        //注释中文unicode该成中文，在idea配置中修改file encodings 都改为UTF-8编码，下面再打勾 (https://blog.csdn.net/wqkeep/article/details/114856505)
//
//        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
//        System.out.println(dog);
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\dog.dat"));
//        oos.writeObject(dog);
//        oos.close();
    }

    //在编写一个方法，反序列化dog
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "e:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();
        //Object dog = ois.readObject();

        System.out.println("===反序列化后 dog====");
        System.out.println(dog);

        ois.close();

    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
