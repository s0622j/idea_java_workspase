package hsp.chapter27_regexp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName RegExp09_10.java
 * @Description TODO 非贪婪匹配
 *                   当此字符紧随任何其他限定符（*、+、?、{n}、{n,}、{n,m}）之后时，匹配模式是"非贪心的"
 * @createTime 2022-04-26 15:46:00
 */
public class RegExp09_10 {

    public static void main(String[] args) {
        String content = "hello111111 ok";
        //String regStr = "\\d+"; //默认是贪婪匹配
        // String regStr = "\\d+?"; //非贪婪匹配
        String regStr = "\\d+?"; //非贪婪匹配

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
