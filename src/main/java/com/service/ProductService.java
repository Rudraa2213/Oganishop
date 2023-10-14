package com.service;

import java.util.ArrayList;

import com.model.ProductModel;

public interface ProductService {
	
		int Insert(ProductModel product);
		ArrayList<ProductModel> fetchAllData();
		ArrayList<ProductModel> fetchByKeyword();

}
