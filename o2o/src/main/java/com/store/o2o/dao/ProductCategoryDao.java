package com.store.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.store.o2o.entity.ProductCategory;

public interface ProductCategoryDao {

	/**
	 * 通过shop id 查询店铺商铺类别
	 */
	
	
	
	List <ProductCategory> queryProductCategoryList(long shopId);
	
	/**
	 * 批量新增商品类型
	 * @param productCategoryList
	 * @return
	 */
	int batchInsertProductCategory(List<ProductCategory> productCategoryList);
	
	
	/**
	 * 删除指定商品类别
	 */
	int deleteProductCategory(@Param("productCategoryId") long productCategoryId, @Param("shopId") long shopId);
	
}
