package hsp.chapter25_JDBC.jdbc_01.myjdbc_01;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName OracleJdbcImpl_03.java
 * @Description TODO 模拟oracle数据库实现 jdbc
 * @createTime 2022-04-22 09:54:00
 */
public class OracleJdbcImpl_03 implements JdbcInterface_01{
    @Override
    public Object getConnection() {
        System.out.println("得到 oracle的连接 升级");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 对oracle的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 oracle的连接");
    }
}
