package com.petrichor.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.petrichor.dao.BrandMaaper;
import com.petrichor.pojo.goods.Brand;
import com.petrichor.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * 品牌业务逻辑层实现类
 * @author Silhouette
 * @date 2020-11-20
 * */
//service注解需要选择com.alibaba.dubbo.config.annotation.Service
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMaaper brandMaaper;

    @Override
    public List<Brand> findAllBrand() {
        return brandMaaper.selectAll();
    }
}
