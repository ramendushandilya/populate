package com.shandilya.populate.flipkart.persistence.services.impl;

import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.Repository.*;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProducts;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProducts;
import com.shandilya.populate.flipkart.products.camera.model.CameraProducts;
import com.shandilya.populate.flipkart.products.cameraAccessories.model.CameraAccessories;
import com.shandilya.populate.flipkart.products.desktops.models.DesktopProducts;
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

    @Autowired
    private CameraRepository cameraRepository;

    @Autowired
    private CameraAccessoriesRepository cameraAccessoriesRepository;

    @Autowired
    private DesktopRepository desktopRepository;

    @Override
    public void saveAcs() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("AirConditioners");
        System.out.println("Ext API  ="+extProds.size());

        List<AcProducts> prods = conversionService.convert(extProds, AcProducts.class);
        System.out.println("Post conversion ="+prods.size());
        acRepository.saveAll(prods);
    }

    @Override
    public void saveAudioPlayers() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("AudioPlayers");
        List<AudioPlayerProducts> prods = conversionService.convert(extProds, AudioPlayerProducts.class);
        audioPlayerRepository.saveAll(prods);
    }

    @Override
    public void saveAutomotive() {
        List<ProductsExt> extProds = aggregatorService.getAllProducts("Automotive");
        List<AutomotiveProducts> prods = conversionService.convert(extProds, AutomotiveProducts.class);
        automotiveRepository.saveAll(prods);
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
        System.out.println("Total products fetched from API = "+extProds.size());
        List<CameraAccessories> accessories = conversionService.convert(extProds, CameraAccessories.class);
        System.out.println("Total products converted = "+accessories.size());
        cameraAccessoriesRepository.saveAll(accessories);
    }

    @Override
    public void saveCameras() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("Cameras");
        System.out.println("Total products fetched from API = "+extProds.size());
        List<CameraProducts> cameras = conversionService.convert(extProds, CameraProducts.class);
        System.out.println("Total products converted = "+cameras.size());
        //cameraRepository.saveAll(cameras);
        for(CameraProducts cp : cameras) {
            cameraRepository.save(cp);
        }
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
        List<DesktopProducts> products = conversionService.convert(extProds, DesktopProducts.class);
        desktopRepository.saveAll(products);
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