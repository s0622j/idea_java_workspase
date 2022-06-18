package hsp.chapter19_IO.transformation_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName CodeQuestion_01.java
 * @Description TODO 看一个中文乱码问题
 * @createTime 2022-04-11 15:02:00
 */
public class CodeQuestion_01 {
    public static void main(String[] args) throws IOException {
        //读取e:\\a.txt 文件到程序
        //思路
        //1.  创建字符输入流 BufferedReader [处理流]
        //2. 使用 BufferedReader 对象读取a.txt
        //3. 默认情况下，读取文件是按照 utf-8 编码
        String filePath = "e:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println("读取到的内容: " + s);
        br.close();

        //InputStreamReader
        //OutputStreamWriter
    }
}
