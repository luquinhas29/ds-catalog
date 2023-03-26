package com.devsuperior.ds_catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.ds_catalog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
