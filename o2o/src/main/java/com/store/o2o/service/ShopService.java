package com.store.o2o.service;

import java.io.File;
import java.io.InputStream;

import com.store.o2o.dto.ImageHolder;
import com.store.o2o.dto.ShopExecution;
import com.store.o2o.entity.Shop;
import com.store.o2o.exceptions.ShopOperationException;

public interface ShopService {
	
	
	
	public ShopExecution addShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

	Shop getByShopId(long shopId);
	
	public ShopExecution modifyShop(Shop shop, ImageHolder thumbnail) throws ShopOperationException;

	public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
	
	
	
	
}
