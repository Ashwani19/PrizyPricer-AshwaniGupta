package com.xebia.prizyapp.repo;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.xebia.prizyapp.model.ProductPrice;

public interface ProductPriceRepository extends Repository<ProductPrice, Long> {

	/**
	 * Saves the given {@link ProductPrice}
	 * 
	 * @param productPrice
	 * @return
	 */
	ProductPrice save(ProductPrice productPrice);

	List<ProductPrice> findByBarCodeOrderByPriceDesc(Long barCode);
}
