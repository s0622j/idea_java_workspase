package hsp.chapter27_regexp.regexp;

import java.util.regex.Pattern;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName PatternMethod_13.java
 * @Description TODO 演示matches方法，用于整体匹配, 在验证输入的字符串是否满足条件使用
 * @createTime 2022-04-26 22:26:00
 */
public class PatternMethod_13 {
    public static void main(String[] args) {
        String content = "hello abc hello, 韩顺平教育";
        //String regStr = "hello";
        String regStr = "hello.*";

        boolean matches = Pattern.matches(regStr, content);
        System.out.println("整体匹配= " + matches);
    }
}
