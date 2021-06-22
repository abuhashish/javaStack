package com.codingdojo.ProdsAndCats.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ProdsAndCats.models.Product;
import com.codingdojo.ProdsAndCats.models.categories_products;



@Repository
public interface categories_productsRepository extends CrudRepository<categories_products,Long>{
	List <categories_products> findAll();
	List <categories_products> findByProduct(Product x);
	List <categories_products> findAllByProductNameNotLike(String x);
}
