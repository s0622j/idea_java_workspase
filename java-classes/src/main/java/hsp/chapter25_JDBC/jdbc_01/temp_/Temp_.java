package hsp.chapter25_JDBC.jdbc_01.temp_;

import hsp.chapter25_JDBC.jdbc_01.utils_05.JDBCUtils_01;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName Temp_.java
 * @Description TODO
 * @createTime 2022-04-24 20:26:00
 */
public class Temp_ {
    @Test
    public void m1() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) { //操作数据库5k
            Connection connection = JDBCUtils_01.getConnection();
            //System.out.println("do something..");
            JDBCUtils_01.close(null,null,connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("连接5k次mysql 耗时=" + (end - start));


    }
}
