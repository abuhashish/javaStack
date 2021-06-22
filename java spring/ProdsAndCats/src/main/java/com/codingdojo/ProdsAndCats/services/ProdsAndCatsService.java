package com.codingdojo.ProdsAndCats.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.ProdsAndCats.models.Category;
import com.codingdojo.ProdsAndCats.models.Product;
import com.codingdojo.ProdsAndCats.models.categories_products;
import com.codingdojo.ProdsAndCats.repositories.CategoryRepository;
import com.codingdojo.ProdsAndCats.repositories.ProductRepository;
import com.codingdojo.ProdsAndCats.repositories.categories_productsRepository;
@Service
public class ProdsAndCatsService {
private final ProductRepository PR;
private final CategoryRepository CR;
private final categories_productsRepository CPR;
public ProdsAndCatsService(ProductRepository PR,CategoryRepository CR,categories_productsRepository CPR) {
	this.PR=PR;
	this.CR=CR;
	this.CPR=CPR;
}
public Product createProduct(Product b) {
	return PR.save(b);
}
public Category createCategory(Category b) {
	return CR.save(b);
}
public Product findProductById(long id){
	Optional<Product> optionalProduct = PR.findById(id);
	if (optionalProduct.isPresent()) {
		return optionalProduct.get();
	} else {
		return null;
	}
}
public List <Category> findAllCategory(){
	return CR.findAll();
}
public Category findCategorytById(long id){
	Optional<Category> optionalCategory = CR.findById(id);
	if (optionalCategory.isPresent()) {
		return optionalCategory.get();
	} else {
		return null;
	}
}

public categories_products createAssociation(categories_products ass) {
	System.out.println(ass.getCategory().getName()+"*************"+ass.getProduct().getName());
	return CPR.save(ass);
}
public List<categories_products> cpall() {
	return CPR.findAll();
}
//List<Category> findByProductsNotContains(Product product);
public List<Category> findByProductsNotContains(Product product) {
	return CR.findByProductsNotContains(product);
}
public List<categories_products> findByProduct(Product x){
	return CPR.findByProduct(x);
}
public List<categories_products> findAllWithNoProduct(Product x){
	String g=x.getName();
	return CPR.findAllByProductNameNotLike(g);
}
}
