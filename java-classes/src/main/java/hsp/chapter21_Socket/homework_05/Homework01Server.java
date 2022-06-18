package hsp.chapter21_Socket.homework_05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Homework01Server.java
 * @Description TODO 服务端, 使用字符流方式读写
 * @createTime 2022-04-15 09:15:00
 */
@SuppressWarnings({"all"})
public class Homework01Server {
    public static void main(String[] args) throws IOException {

        //思路
        //1. 在本机 的9999端口监听, 等待连接
        //   细节: 要求在本机没有其它服务在监听9999
        //   细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");
        //2. 当没有客户端连接9999端口时，程序会 阻塞, 等待连接
        //   如果有客户端连接，则会返回Socket对象，程序继续

        Socket socket = serverSocket.accept();

        //
        //3. 通过socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream inputStream = socket.getInputStream();
        //4. IO读取, 使用字符流, 老师使用 InputStreamReader 将 inputStream 转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(s)) {
            answer = "我是韩顺平";
        } else if("hobby".equals(s)) {
            answer = "编写java程序";
        } else {
            answer = "你说的啥子";
        }


        //5. 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //    使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();// 插入一个换行符，表示回复内容的结束
        bufferedWriter.flush();//注意需要手动的flush


        //6.关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();//关闭


//
//        ServerSocket serverSocket = new ServerSocket(9999);
//        System.out.println("服务端再9999等待......");
//        // 接收
//        Socket accept = serverSocket.accept();
//        InputStream inputStream = accept.getInputStream();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        String s = bufferedReader.readLine();
//        System.out.println(s);
//        // 发送
//        OutputStream outputStream = accept.getOutputStream();
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//        bufferedWriter.write("我是 nova");
//        bufferedWriter.newLine();
//        bufferedWriter.flush();
//        // 接收
//        String s1 = bufferedReader.readLine();
//        System.out.println("s1:" + s1);
//        // 发送
//        bufferedWriter.write("编写java吧");
//        bufferedWriter.newLine();
//        bufferedWriter.flush();
//        // 接收
//        String s2 = bufferedReader.readLine();
//        System.out.println("s2:" + s2);
//        // 关闭
//        bufferedWriter.close();
//        bufferedReader.close();
//        accept.close();
//        serverSocket.close();
    }
}
