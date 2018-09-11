package com.xebia.prizyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.prizyapp.model.Product;
import com.xebia.prizyapp.model.ProductPrice;
import com.xebia.prizyapp.repo.ProductPriceRepository;
import com.xebia.prizyapp.repo.ProductRepository;

@Service
public class ProductLoaderServiceImpl implements ProductLoaderService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductPriceRepository productPriceRepository;

	@Override
	public Product getProduct(long barCode) {
		return this.productRepository.findByBarCode(barCode);
	}

	@Override
	public boolean saveProductPrice(ProductPrice productPrice) {
		return this.productPriceRepository.save(productPrice) != null ? true : false;
	}
}
