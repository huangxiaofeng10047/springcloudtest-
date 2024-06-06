package com.yylx.springcloud.service.impl;

import com.yylx.springcloud.dao.ProductMapper;
import com.yylx.springcloud.dto.Result;
import com.yylx.springcloud.entity.Product;
import com.yylx.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductMapper productMapper;

    @HystrixCommand(fallbackMethod = "selectByIdFallbackHandler", commandProperties = {
        // 是否启用服务熔断
        @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
        // 请求阈值
        @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
        // 时间窗口
        @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
        // 错误比率
        @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50")
    })
    public Product selectById(Long id) throws Exception {
        if(id < 0){
            throw new Exception("id为负数");
        }
        return productMapper.selectById(id);
    }

    public Product selectByIdFallbackHandler(Long id){
        return null;

    }
    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    public int updateById(Long id, String name) {
        return productMapper.updateById(id, name);
    }

    public int insertOne(Product product) {
        return productMapper.insertOne(product);
    }
}

