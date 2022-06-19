package com.heima.mapper;

import com.heima.pojo.User;

import java.util.List;

/**
 * @author shenjie
 * @version 1.0
 */
public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);

}
