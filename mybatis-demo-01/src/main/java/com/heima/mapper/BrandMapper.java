package com.heima.mapper;


import com.heima.pojo.Brand;

import java.util.List;

/**
 * @author shenjie
 * @version 1.0
 */
public interface BrandMapper {
    /**
     * 查询所有
     */

    public List<Brand> selectAll();
}
