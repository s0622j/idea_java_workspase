package hsp.chapter25_JDBC.jdbc_01.myjdbc_01;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName TestJDBC.java
 * @Description TODO
 * @createTime 2022-04-22 09:50:00
 */
public class TestJDBC {
    public static void main(String[] args) throws Exception {
        //完成对mysql的操作
        JdbcInterface_01 jdbcInterface = new MysqlJdbcImpl_02();
        jdbcInterface.getConnection(); //通过接口来调用实现类[动态绑定]
        jdbcInterface.crud();
        jdbcInterface.close();


        //完成对oracle的操作
        System.out.println("==============================");
        jdbcInterface = new OracleJdbcImpl_03();
        jdbcInterface.getConnection(); //通过接口来调用实现类[动态绑定]
        jdbcInterface.crud();
        jdbcInterface.close();

    }
}
