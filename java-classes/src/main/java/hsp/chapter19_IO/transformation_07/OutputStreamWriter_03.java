package hsp.chapter19_IO.transformation_07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName OutputStreamWriter_03.java
 * @Description TODO 演示 OutputStreamWriter 使用
 *                   把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 *                   指定处理的编码 gbk/utf-8/utf8
 * @createTime 2022-04-11 15:38:00
 */
public class OutputStreamWriter_03 {
    public static void main(String[] args) throws IOException {
        String filePath = "e:\\hsp.txt";
        String charSet = "utf-8";
        //String charSet = "gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        osw.write("hi, 韩顺平教育");
        osw.close();
        System.out.println("按照 " + charSet + " 保存文件成功~");


    }
}
