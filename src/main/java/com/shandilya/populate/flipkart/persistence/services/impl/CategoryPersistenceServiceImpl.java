package com.shandilya.populate.flipkart.persistence.services.impl;

import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.Repository.AcRepository;
import com.shandilya.populate.flipkart.persistence.Repository.AudioPlayerRepository;
import com.shandilya.populate.flipkart.persistence.Repository.AutomotiveRepository;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProducts;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryPersistenceServiceImpl implements CategoryPersistenceService {

    @Autowired
    private PopulateConversionService conversionService;

    @Autowired
    private ProductUrlAggregatorService aggregatorService;

    @Autowired
    private AcRepository acRepository;

    @Autowired
    private AudioPlayerRepository audioPlayerRepository;

    @Autowired
    private AutomotiveRepository automotiveRepository;

    @Override
    public void saveAcs() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("AirConditioners");

        List<AcProducts> prods = conversionService.convert(extProds, AcProducts.class);

        acRepository.saveAll(prods);
    }

    @Override
    public void saveAudioPlayers() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("AudioPlayers");
        System.out.println("total audio player #########"+extProds.size() );
        List<AudioPlayerProducts> prods = conversionService.convert(extProds, AudioPlayerProducts.class);
        audioPlayerRepository.saveAll(prods);
    }

    @Override
    public void saveAutomotive() {
        Long start = System.nanoTime();
        System.out.println("Entering....#####");
        List<ProductsExt> extProds = aggregatorService.getAllProducts("Automotive");
        System.out.println("Exit complete....#####");
        Long end = System.nanoTime();
        System.out.println("Fetched Automotive prods in time seconds = "+(end-start)/1000000000);
        List<AutomotiveProducts> prods = conversionService.convert(extProds, AutomotiveProducts.class);
        automotiveRepository.saveAll(prods);
        System.out.println("Confirmation call.......######");
    }

    @Override
    public void saveBabyCare() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("BabyCare");

    }

    @Override
    public void saveBagsWalletsBelts() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("BagsWalletsBelts");

    }

    @Override
    public void saveCameraAccessories() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("CameraAccessories");

    }

    @Override
    public void saveCameras() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("Cameras");

    }

    @Override
    public void saveComputerComponents() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("ComputerComponents");

    }

    @Override
    public void saveComputerPeripherals() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("ComputerPeripherals");

    }

    @Override
    public void saveComputerStorage() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("ComputerStorage");

    }

    @Override
    public void saveDesktops() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("Desktops");

    }

    @Override
    public void saveELearning() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("ELearning");

    }

    @Override
    public void saveEyewear() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("Eyewear");
    }
}