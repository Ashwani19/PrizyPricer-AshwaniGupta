package com.xebia.prizyapp.service;

import com.xebia.prizyapp.model.Product;
import com.xebia.prizyapp.model.ProductPrice;

public interface ProductLoaderService {
	Product getProduct(long barCode);

	boolean saveProductPrice(ProductPrice productPrice);
}
