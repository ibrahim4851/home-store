package com.ibrahim.homestore.controller;


import com.ibrahim.homestore.repo.CategoryRepository;
import com.ibrahim.homestore.repo.SubCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories/")
public class CategoryController {

    private SubCategoryRepository subCategoryRepository;
    private CategoryRepository categoryRepository;


}
