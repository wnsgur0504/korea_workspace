package com.koreait.fashionshop.model.product.service;

import java.util.List;

import com.koreait.fashionshop.common.FileManager;
import com.koreait.fashionshop.model.domain.Product;

public interface ProductService {
	public List selectAll();//모든 상품
	public List selectById(int subcategory_id);//하위 카테고리에 소속된 모든 상품
	public Product select(int product_id);//상품 한건
	public void regist( FileManager filemanager, Product product); //insert만 하는게 아니기 때문...
	public void update(Product product);
	public void delete(int product_id);
}
