package hsp.chapter12_Exception.exception_01;

/**
 * @author shenjie
 * @version 1.0
 */
public class NumberFormatException_06 {
    public static void main(String[] args) {
        String name = "韩顺平教育";
        //将String 转成 int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);//1234
    }
}
