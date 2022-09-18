package com.zxp.mapper;
import com.zxp.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface  BrandMapper {
    List<Brand> selectAll();
    void addBrand(Brand brand);
    void deleteById(int id);
    void deleteByIds(@Param("ids") int[] ids);
    void updateBrand(Brand brand);
    List<Brand> selectByPage(@Param("begin") int begin, @Param("size") int size);
    int selectTotalCount();
    List<Brand> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("brand") Brand brand);
    int selectTotalCountByCondition(Brand brand);
}