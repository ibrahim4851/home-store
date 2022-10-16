package com.ibrahim.homestore.repo;

import com.ibrahim.homestore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getProductsByCategoryAndSubCategory(Long categoryId, Long subCategoryId);
    List<Product> findProductsByCategoryAndSubCategoryOrderByRating(Long categoryId, Long subCategoryId);

}
