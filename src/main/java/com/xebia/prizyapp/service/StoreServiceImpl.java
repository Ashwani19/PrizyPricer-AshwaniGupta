package com.xebia.prizyapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.prizyapp.model.Store;
import com.xebia.prizyapp.repo.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepository;

	@Override
	public List<Store> getStores() {
		return this.storeRepository.findAll();
	}

}
