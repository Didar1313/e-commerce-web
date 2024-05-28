package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
