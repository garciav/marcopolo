package com.store.marcopolo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.marcopolo.model.Product;
import com.store.marcopolo.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "hello")
	public String hello() {
		return "Hola mundo cruel";
	}

	@GetMapping(value = "products")
	public List<Product> findAll() {
		return productService.getAll();
	}

	@PostMapping(value = "products")
	public Product newProduct(@RequestBody Product product) {
		return productService.create(product);
	}
	
	@DeleteMapping(value = "products/{id}")
	public void delete(@PathVariable Long id) {
		productService.delete(id);
	}
}
