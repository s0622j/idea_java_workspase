package hsp.chapter23_reflection.reflection_01.homework_04;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Homework01.java
 * @Description TODO
 * @createTime 2022-04-19 13:12:00
 */
public class Homework01 {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /**
         * 定义PrivateTest类，有私有name属性，并且属性值为hellokitty
         * 提供getName的公有方法
         * 创建PrivateTest的类，利用Class类得到私有的name属性，修改私有的name属性值，并调用getName()的方法打印name属性值
         */
        //1. 得到 PrivateTest类对应的Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //2. 创建对象实例
        PrivateTest privateTestObj = privateTestClass.newInstance();
        //3. 得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");//name属性是private
        //4. 暴破name
        name.setAccessible(true);
        name.set(privateTestObj, "天龙八部");
        //5. 得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6. 因为getName() 是public，所有直接调用
        Object invoke = getName.invoke(privateTestObj);
        System.out.println("name属性值=" + invoke);//天龙八部

    }
}

class PrivateTest {
    private String name = "hellokitty";
    //默认无参构造器
    public String getName() {
        return name;
    }
}
