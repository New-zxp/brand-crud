package com.zxp.service;

import com.zxp.pojo.Brand;
import com.zxp.pojo.PageBean;

import java.util.List;

public interface BrandService {
    List<Brand> selectAll();
    void add(Brand brand);
    void deleteById(int id);
    void deleteByIds(int[] ids);
    void updateBrand(Brand brand);
    PageBean<Brand> selectByPage(int currentPage,int pageSize);
    PageBean<Brand> selectByPageAndCondition(int currentPage, int pageSize, Brand brand);
}