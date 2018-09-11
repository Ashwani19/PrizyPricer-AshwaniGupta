package com.xebia.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.xebia.prizyapp.service.ProductLoaderService;
import com.xebia.prizyapp.service.ProductLoaderServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ProductLoaderServiceImplTest {

	@InjectMocks
	private ProductLoaderService productLoaderService = new ProductLoaderServiceImpl();
	
	@Test
	public void shouldGetAProduct(){

	}
}
