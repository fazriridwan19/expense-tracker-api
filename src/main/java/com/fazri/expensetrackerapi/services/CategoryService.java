package com.fazri.expensetrackerapi.services;

import com.fazri.expensetrackerapi.domain.Category;
import com.fazri.expensetrackerapi.exceptions.EtBadRequestException;
import com.fazri.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategory(Integer userId);
    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

}
