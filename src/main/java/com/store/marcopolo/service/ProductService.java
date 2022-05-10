package com.store.marcopolo.service;

import java.util.List;

import com.store.marcopolo.model.Product;


public interface ProductService {

	List<Product> getAll();

	Product create(Product product);

	void delete(Long id);

}