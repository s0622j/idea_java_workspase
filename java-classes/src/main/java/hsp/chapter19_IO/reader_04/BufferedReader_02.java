package hsp.chapter19_IO.reader_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName BufferedReader_02.java
 * @Description TODO 演示bufferedReader 使用
 * @createTime 2022-04-11 11:29:00
 */
public class BufferedReader_02 {
    public static void main(String[] args) throws IOException {


        String filePath = "e:\\a.java";
        //创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line; //按行读取, 效率高
        //说明
        //1. bufferedReader.readLine() 是按行读取文件
        //2. 当返回null 时，表示文件读取完毕
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        //关闭流, 这里注意，只需要关闭 BufferedReader ，因为底层会自动的去关闭 节点流
        //FileReader。
        /*
            public void close() throws IOException {
                synchronized (lock) {
                    if (in == null)
                        return;
                    try {
                        in.close();//in 就是我们传入的 new FileReader(filePath), 关闭了.
                    } finally {
                        in = null;
                        cb = null;
                    }
                }
            }

         */
        bufferedReader.close();
    }
}
