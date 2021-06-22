package com.codingdojo.ProdsAndCats.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ProdsAndCats.models.Category;
import com.codingdojo.ProdsAndCats.models.Product;



@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
	List<Product> findByCategoriesNotContains(Category category);
}
