package hsp.chapter25_JDBC.jdbc_01.datasource_08;

import hsp.chapter25_JDBC.jdbc_01.utils_05.JDBCUtils_01;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName ConQuestion_01.java
 * @Description TODO
 * @createTime 2022-04-23 21:00:00
 */
public class ConQuestion_01 {


    //代码 连接mysql 5000次
    @Test
    public void testCon() {

        //看看连接-关闭 connection 会耗用多久
        long start = System.currentTimeMillis();
        System.out.println("开始连接.....");
        for (int i = 0; i < 5000; i++) {
            //使用传统的jdbc方式，得到连接
            Connection connection = JDBCUtils_01.getConnection();
            //做一些工作，比如得到PreparedStatement ，发送sql
            //..........
            //关闭
            JDBCUtils_01.close(null, null, connection);

        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式5000次 耗时=" + (end - start));//传统方式5000次 耗时=7099
    }
}
