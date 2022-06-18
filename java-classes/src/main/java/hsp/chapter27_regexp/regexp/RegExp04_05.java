package hsp.chapter27_regexp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName RegExp04_05.java
 * @Description TODO 选择匹配符
 * @createTime 2022-04-26 13:47:00
 */
public class RegExp04_05 {
    public static void main(String[] args) {

        String content = "hanshunping 韩 寒冷";
        String regStr = "han|韩|寒";

        Pattern pattern = Pattern.compile(regStr/*, Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
