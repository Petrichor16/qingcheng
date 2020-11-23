package com.petrichor.service.goods;

import com.petrichor.entity.PageResult;
import com.petrichor.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

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

     /**
      * 分页查找品牌
      *
      * @param page
      * @param pageSize
      * @return
      * */
     PageResult<Brand> findBrandByPage(int page,int pageSize);

    /**
     * 按条件查找品牌
     *
     * @param searchMap
     * @return
     * */
     List<Brand> findBrandByConditions(Map<String,Object> searchMap);
}
