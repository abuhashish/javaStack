package com.codingdojo.ProdsAndCats.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.ProdsAndCats.models.Category;
import com.codingdojo.ProdsAndCats.models.Product;
import com.codingdojo.ProdsAndCats.models.categories_products;
import com.codingdojo.ProdsAndCats.services.ProdsAndCatsService;
@Controller
public class ProdsAndCatsApi {
private final ProdsAndCatsService PACS;
public ProdsAndCatsApi(ProdsAndCatsService PACS) {
	this.PACS=PACS;
}
@RequestMapping("/products/new")
public String hello(@ModelAttribute("Product") Product Product) {
	return "/pac/addProduct.jsp";
}

@RequestMapping("/categories/new")
public String helloz(@ModelAttribute("Category") Category Category) {
	return "/pac/addCategory.jsp";
}
@RequestMapping("/cats")
public String createCat(@Valid @ModelAttribute("Category") Category x, BindingResult result) {
    if (result.hasErrors()) {
        return "/pac/addCategory.jsp";
    } else {
    	PACS.createCategory(x);
        return "redirect:/";
    }
}
@RequestMapping("/prods")
public String createProd(@Valid @ModelAttribute("Product") Product x, BindingResult result) {
    if (result.hasErrors()) {
        return "/pac/addProduct.jsp";
    } else {
    	PACS.createProduct(x);
        return "redirect:/";
    }

	  }
@RequestMapping("/products/{id}")
public String prods(Model model,@PathVariable (value="id") Long id,@ModelAttribute("categories_products") categories_products categories_products) {
	Product x=PACS.findProductById(id);
	List <Category> y=PACS.findAllCategory();
	model.addAttribute("x",x);
	model.addAttribute("y",y);
	return "/pac/show.jsp";
	
}
@RequestMapping(value="/addCat")
public String addcat(@Valid @ModelAttribute("categories_products") categories_products x, BindingResult result) {
	 if (result.hasErrors()) {
	        return "/pac/addProduct.jsp";
	    } else {
	    	PACS.createAssociation(x);
	        return "redirect:/";
	    }	
}
@RequestMapping("/")
public String test(Model model) {
//	List <categories_products> x=PACS.cpall();
//	model.addAttribute("x",x);
	Product product=PACS.findProductById(1);
	model.addAttribute("product",product);
//	model.addAttribute("product",product);
//	List <Category> xg=PACS.findByProductsNotContains(product);
//	model.addAttribute("xg",xg);
//	List <categories_products> gxg=PACS.findByProduct(product);
//	model.addAttribute("gxg",gxg);
//	List <categories_products> xgx=PACS.findAllWithNoProduct(product);
//	model.addAttribute("xgx",xgx);
	return "/pac/test.jsp";
}


}

