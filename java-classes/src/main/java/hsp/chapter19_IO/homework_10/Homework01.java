package hsp.chapter19_IO.homework_10;

import java.io.*;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Homework01.java
 * @Description TODO
 * @createTime 2022-04-12 15:51:00
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        /**
         *(1) 在判断e盘下是否有文件夹mytemp ,如果没有就创建mytemp
         *(2) 在e:\\mytemp 目录下, 创建文件 hello.txt
         *(3) 如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         *(4) 并且在hello.txt 文件中，写入 hello,world~

         */

        String directoryPath = "e:\\mytemp";
        File file = new File(directoryPath);
        if(!file.exists()) {
            //创建
            if(file.mkdirs()) {
                System.out.println("创建 " + directoryPath + " 创建成功" );
            }else {
                System.out.println("创建 " + directoryPath + " 创建失败");
            }
        }

        String filePath  = directoryPath + "\\hello.txt";// e:\mytemp\hello.txt
        file = new File(filePath);
        if(!file.exists()) {
            //创建文件
            if(file.createNewFile()) {
                System.out.println(filePath + " 创建成功~");

                //如果文件存在，我们就使用BufferedWriter 字符输入流写入内容
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello, world~~ 韩顺平教育");
                bufferedWriter.close();

            } else {
                System.out.println(filePath + " 创建失败~");
            }
        } else {
            //如果文件已经存在，给出提示信息
            System.out.println(filePath + " 已经存在，不在重复创建...");
        }

//
//        String filePath = "e:\\mytemp";
//        String filePath2 = "e:\\mytemp\\hello.txt";
//        File file = new File(filePath);
//        File file2 = new File(filePath2);
//
//        FileOutputStream fos = null;
//
//        if (file.exists()) {
//            System.out.println(filePath + "存在..");
//        } else {
//            if (file.mkdirs()) {
//                System.out.println(filePath + "创建成功..");
//            } else {
//                System.out.println(filePath + "创建失败..");
//            }
//        }
//
//        if (file2.exists()) {
//            System.out.println(filePath2 + "存在..");
//            fos = new FileOutputStream(file2);
//            fos.write("hello,world~".getBytes());
//            fos.close();
//        } else {
//            if (file2.createNewFile()) {
//                System.out.println(filePath2 + "创建成功..");
//            } else {
//                System.out.println(filePath2 + "创建失败..");
//            }
//        }

    }
}
