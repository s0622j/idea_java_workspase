package hsp.chapter19_IO.transformation_07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName InputStreamReader_02.java
 * @Description TODO 演示使用 InputStreamReader 转换流解决中文乱码问题
 *                   将字节流 FileInputStream 转成字符流  InputStreamReader, 指定编码 gbk/utf-8
 * @createTime 2022-04-11 15:31:00
 */
public class InputStreamReader_02 {

    public static void main(String[] args) throws IOException {

        String filePath = "e:\\a.txt";
        //解读
        //1. 把 FileInputStream 转成 InputStreamReader
        //2. 指定编码 gbk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //3. 把 InputStreamReader 传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);

        //将2 和 3 合在一起
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath), "gbk"));

        //4. 读取
        String s = br.readLine();
        System.out.println("读取内容=" + s);
        //5. 关闭外层流
        br.close();

    }
}
