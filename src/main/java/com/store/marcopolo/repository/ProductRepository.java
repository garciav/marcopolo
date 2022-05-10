package com.store.marcopolo.repository;

import org.springframework.data.repository.CrudRepository;

import com.store.marcopolo.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
