package com.petrichor.service.goods;

import com.petrichor.pojo.goods.Brand;

import java.util.List;

/**
 * 品牌业务逻辑层实现类
 * @author Silhouette
 * @date 2020-11-20
 * */
public interface BrandService {

    /**
     * 查找所有品牌
     * @return
     * */
     List<Brand> findAllBrand();
}
