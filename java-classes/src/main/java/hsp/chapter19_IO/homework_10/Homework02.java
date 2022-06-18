package hsp.chapter19_IO.homework_10;

import java.io.*;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Homework02.java
 * @Description TODO
 * @createTime 2022-04-12 16:33:00
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        /**
         * 要求:  使用BufferedReader读取一个文本文件，为每行加上行号，
         * 再连同内容一并输出到屏幕上。
         */

        String filePath = "e:\\a.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {//循环读取
                System.out.println(++lineNum + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 转换流处理编码问题 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));


        /**
         * 要求:  使用BufferedReader读取一个文本文件，为每行加上行号，
         * 再连同内容一并输出到屏幕上。
         */
//        String filePath = "e:\\mytemp\\hello.txt";
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
//        int lineNum = 0;
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println("行号："+ (++lineNum) + "    " + line);
//        }
//        bufferedReader.close();

    }
}
