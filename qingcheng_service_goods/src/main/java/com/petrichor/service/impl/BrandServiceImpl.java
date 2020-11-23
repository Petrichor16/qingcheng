package com.petrichor.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mysql.jdbc.StringUtils;
import com.petrichor.dao.BrandMaaper;
import com.petrichor.entity.PageResult;
import com.petrichor.pojo.goods.Brand;
import com.petrichor.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;


import java.util.List;
import java.util.Map;

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

    @Override
    public PageResult<Brand> findBrandByPage(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        Page<Brand> pageResult = (Page<Brand>) brandMaaper.selectAll();
        return new PageResult<Brand>(pageResult.getTotal(),pageResult.getResult());
    }

    @Override
    public List<Brand> findBrandByConditions(Map<String, Object> searchMap) {
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();
        if (searchMap != null ){
            if (searchMap.containsKey("name") && !StringUtils.isEmptyOrWhitespaceOnly((String) searchMap.get("name"))){
                criteria.andLike("name", "%"+(String) searchMap.get("name")+"%");
            }
            if (searchMap.containsKey("letter") && !StringUtils.isEmptyOrWhitespaceOnly((String) searchMap.get("letter"))){
                criteria.andLike("letter", "%"+(String) searchMap.get("letter")+"%");
            }
        }
        return brandMaaper.selectByExample(example);
    }
}
