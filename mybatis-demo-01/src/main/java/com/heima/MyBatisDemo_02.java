package com.heima;

/**
 * @author shenjie
 * @version 1.0
 */

import com.heima.mapper.UserMapper;
import com.heima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 *
 * Mybatis 快速入门代码
 *
 */
public class MyBatisDemo_02 {
    public static void main(String[] args) throws IOException {
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        //List<User> users = sqlSession.selectList("test.selectAll");
        //3.1 获取UserMapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users);
        //4. 释放资源
        sqlSession.close();
    }
}

/**
 *
 * create database mybatis;
 * use mybatis;
 *
 * drop table if exists tb_user;
 *
 * create table tb_user(
 *                       id int primary key auto_increment,
 *                       username varchar(20),
 *                       password varchar(20),
 *                       gender char(1),
 *                       addr varchar(30)
 * );
 *
 *
 *
 * INSERT INTO tb_user VALUES (1, 'zhangsan', '123', '男', '北京');
 * INSERT INTO tb_user VALUES (2, '李四', '234', '女', '天津');
 * INSERT INTO tb_user VALUES (3, '王五', '11', '男', '西安');
 *
 * select * from tb_user;
 *
 */