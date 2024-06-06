package com.yylx.springcloud.service;

import com.yylx.springcloud.entity.Product;
import org.apache.ibatis.annotations.Param;

/**
 * 商品服务类
 */
public interface ProductService {

    /**
     * 查询
     * @param id
     * @return
     */
    public Product selectById(Long id) throws Exception;


    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteById(Long id);

    /**
     * 修改
     * @param id
     * @param name
     * @return
     */
    public int updateById(Long id, String name);

    /**
     * 新增
     * @param product
     * @return
     */
    public int insertOne(Product product);

}


