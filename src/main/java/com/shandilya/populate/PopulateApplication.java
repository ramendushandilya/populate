package com.shandilya.populate;

import com.shandilya.populate.flipkart.external.api.CategoryService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PopulateApplication implements CommandLineRunner{

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductUrlAggregatorService aggregatorService;

	public static void main(String[] args) {
		SpringApplication.run(PopulateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String acSeed = categoryService.getProductCategoryUrls().get("AirConditioners");
	}
}
