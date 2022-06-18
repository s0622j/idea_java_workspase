package hsp.chapter27_regexp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName RegExp02.java
 * @Description TODO 演示转义字符的使用
 * @createTime 2022-04-26 11:12:00
 */
public class RegExp02_03 {
    public static void main(String[] args) {
        String content = "abc$(a.bc(123( )";
        //匹配( => \\(
        //匹配. => \\.
        //String regStr = "\\.";
        //String regStr = "\\d\\d\\d";
        String regStr = "\\d{3}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
