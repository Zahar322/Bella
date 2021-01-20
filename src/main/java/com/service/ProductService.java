package com.service;

import com.entity.Category;
import com.entity.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllByCategoryId(Long id) {
        Category category = new Category();
        category.setId(id);
        return productRepository.findAllByCategory(category);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
