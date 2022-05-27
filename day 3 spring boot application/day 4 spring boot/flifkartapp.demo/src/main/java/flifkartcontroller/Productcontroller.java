package flifkartcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flifkartbean.Product;
import flifkart. service . ProductService;

@RestController
public class ProductController {

	// inject the depdendency of service class into controller

	@Autowired
	ProductService productService;
	
	
    @PostMapping(value="/createproduct")//endpoint
	Product createProduct(@RequestBody Product prod) {

		Product p = productService.addProduct(prod);//calling service from controller

		return p;

	}

}