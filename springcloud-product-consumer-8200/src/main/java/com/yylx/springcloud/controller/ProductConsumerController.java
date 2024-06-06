package com.yylx.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yylx.springcloud.dto.Result;
import com.yylx.springcloud.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ProductConsumerController {

    @Resource
    RestTemplate restTemplate;
    @Resource
    ProductService productService;

//    public static String url = "http://localhost:8100/";
public static String url = "http://springcloud-product-provider/";
    /**
     * 查询
     * @return
     */
    @GetMapping("product/consumer/get/info")
    public Result selectById(){
        return productService.getServiceInfo();

//        return new Result(200, "查询成功",
//            restTemplate.getForObject(url+"product/provider/get/info", Result.class));
    }


    /**
     * 查询
     * @param id
     * @return
     */
//    @HystrixCommand(fallbackMethod = "getErroInfo")
    @GetMapping("product/consumer/get/{id}")
    public Result selectById(@PathVariable("id") Long id){
        return productService.selectById(id);
//        return new Result(200, "查询成功",
//            restTemplate.getForObject(url+"product/provider/get/"+id, Result.class));
    }
    public Result getErroInfo(Long id ){
        return new Result(500, "服务器内部出现错误", null);
    }

}

