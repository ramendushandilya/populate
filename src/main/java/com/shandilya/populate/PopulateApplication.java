package com.shandilya.populate;

import com.shandilya.populate.flipkart.external.api.CategoryService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PopulateApplication implements CommandLineRunner{

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductUrlAggregatorService aggregatorService;

	@Autowired
	private CategoryPersistenceService persistenceService;

	public static void main(String[] args) {
		SpringApplication.run(PopulateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		long start = System.currentTimeMillis();

		persistenceService.saveAcs();
		persistenceService.saveAircoolers();
		persistenceService.saveAudioPlayers();
		persistenceService.saveAutomotive();
		persistenceService.saveBabyCare();
		persistenceService.saveBagsWalletsBelts();
		persistenceService.saveCameraAccessories();
		persistenceService.saveCameras();
		persistenceService.saveComputerComponents();
		persistenceService.saveComputerPeripherals();
		persistenceService.saveComputerStorage();
		persistenceService.saveDesktops();
		persistenceService.saveELearning();
		persistenceService.saveEyewear();
		persistenceService.saveFoodNutrition();
		persistenceService.saveFragrances();
		persistenceService.saveFurniture();
		persistenceService.saveGaming();
		persistenceService.saveGroomingWellness();
		persistenceService.saveHomeFestiveNeeds();
		persistenceService.saveHomeEntertainment();
		persistenceService.savehomeFurnishing();
		persistenceService.saveHomeImprovementTools();

		long end = System.currentTimeMillis();

		System.out.println("##########Total time elapsed#########"+(end-start)/60000);
	}
}