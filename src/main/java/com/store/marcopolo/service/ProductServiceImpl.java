package com.store.marcopolo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.marcopolo.model.Product;
import com.store.marcopolo.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAll() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product create(Product product) {
		return productRepository.save(product);
	}
	
	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}
}
