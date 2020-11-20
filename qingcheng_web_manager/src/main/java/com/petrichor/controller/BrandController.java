package com.petrichor.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.petrichor.pojo.goods.Brand;
import com.petrichor.service.goods.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * 品牌控制层*/
@RestController
@RequestMapping("/brand")
public class BrandController {

    /**
     * 注意：注入远程的数据需要使用Reference注解
     *      com.alibaba.dubbo.config.annotation.Reference
     * */
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAllBrand(){

        return brandService.findAllBrand();
    }
}
