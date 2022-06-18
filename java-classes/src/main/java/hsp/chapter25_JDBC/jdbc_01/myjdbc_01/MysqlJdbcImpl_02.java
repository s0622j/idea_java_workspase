package hsp.chapter25_JDBC.jdbc_01.myjdbc_01;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName MysqlJdbcImpl.java
 * @Description TODO mysql 数据库实现了jdbc接口 [模拟] 【mysql厂商开发】
 * @createTime 2022-04-22 09:45:00
 */
public class MysqlJdbcImpl_02 implements JdbcInterface_01{
    @Override
    public Object getConnection() {
        System.out.println("得到 mysql 的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 mysql 增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 mysql 的连接");
    }
}
