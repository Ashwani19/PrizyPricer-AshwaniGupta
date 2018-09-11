package com.xebia.prizyapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xebia.prizyapp.model.Product;
import com.xebia.prizyapp.model.ProductDetail;

public interface ProductViewService {

	Page<Product> getProducts(Pageable pageable);

	ProductDetail getProductDetail(Long barCode);

}
