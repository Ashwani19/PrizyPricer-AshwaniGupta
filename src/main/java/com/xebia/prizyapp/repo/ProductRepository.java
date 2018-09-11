package com.xebia.prizyapp.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.xebia.prizyapp.model.Product;

public interface ProductRepository extends Repository<Product, Long>{

	Product findByBarCode(long barCode);

	Page<Product> findAll(Pageable pageable);

}
