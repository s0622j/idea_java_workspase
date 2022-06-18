package hsp.chapter25_JDBC.jdbc_01.myjdbc_01;

/**
 * @author shenjie
 * @version 1.0.0
 * @ClassName JdbcInterface_01.java
 * @Description TODO 我们规定的jdbc接口(方法)
 * @createTime 2022-04-22 09:41:00
 */
public interface JdbcInterface_01 {
    //连接
    public Object getConnection() ;
    //crud
    public void crud();
    //关闭连接
    public void close();
}
