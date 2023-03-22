package com.devsuperior.ds_catalog.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.ds_catalog.entities.Category;

@RestController
@RequestMapping( value = "/categories")
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L,"Books"));
		list.add(new Category(2L,"eletronics"));
		return ResponseEntity.ok().body(list);
	}
	

}