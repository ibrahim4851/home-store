package com.ibrahim.homestore.controller;


import com.ibrahim.homestore.entity.Category;
import com.ibrahim.homestore.repo.CategoryRepository;
import com.ibrahim.homestore.repo.SubCategoryRepository;
import com.ibrahim.homestore.service.CategoryService;
import com.ibrahim.homestore.service.SubCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories/")
public class CategoryController {

    private SubCategoryService subCategoryService;
    private CategoryService categoryService;

    @GetMapping("all")
    public List<Category> getAllCategories(){
        return categoryService.findAll();
    }


}
