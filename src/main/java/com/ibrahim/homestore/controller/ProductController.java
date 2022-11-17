package com.ibrahim.homestore.controller;

import com.ibrahim.homestore.entity.Product;
import com.ibrahim.homestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("all")
    public List<Product> getAll() {
        return productService.findAll();
    }

    @GetMapping("{category}/{subcategory}")
    @ResponseBody
    public List<Product> getBySubCategory(@PathVariable(value = "category") Long categoryId,
                                          @PathVariable(value = "subcategory") Long subCategoryId) {
        return productService.getProductsWithSubCategory(categoryId, subCategoryId);
    }

}
