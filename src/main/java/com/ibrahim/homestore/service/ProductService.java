package com.ibrahim.homestore.service;

import com.ibrahim.homestore.entity.Product;
import com.ibrahim.homestore.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ProductService {

    private final ProductRepository repository;

    public Product addProduct(Product product) {return repository.save(product);}

    public List<Product> getProductsWithSubCategory(Long categoryId, Long subCategoryId) {
        return repository.getProductsByCategoryAndSubCategory(categoryId, subCategoryId);
    }

    public List<Product> getProductsSortedByRatingAndCategory(Long categoryId, Long subCategoryId) {
        return repository.findProductsByCategoryAndSubCategoryOrderByRating(categoryId, subCategoryId);
    }

    public List<Product> findAll(){return repository.findAll();}

}
