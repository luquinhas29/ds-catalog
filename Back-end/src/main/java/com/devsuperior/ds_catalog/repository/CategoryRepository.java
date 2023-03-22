package com.devsuperior.ds_catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.ds_catalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
