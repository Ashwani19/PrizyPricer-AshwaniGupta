package com.xebia.prizyapp.repo;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.xebia.prizyapp.model.Store;

public interface StoreRepository extends Repository<Store, Long>{
	
	List<Store> findAll();
}
