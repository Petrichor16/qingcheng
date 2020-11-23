package com.petrichor.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.petrichor.entity.PageResult;
import com.petrichor.pojo.goods.Brand;
import com.petrichor.service.goods.BrandService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

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

    @RequestMapping("/find-all")
    public List<Brand> findAllBrand(){

        return brandService.findAllBrand();
    }

    @GetMapping("/find-by-page")
    public PageResult<Brand> findBrandByPage(int page, int pageSize){
        return brandService.findBrandByPage(page,pageSize);
    }

    @PostMapping("/find-by-conditions")
    public List<Brand> findByConditions(@RequestBody Map searchMap){
        return brandService.findBrandByConditions(searchMap);
    }

}
