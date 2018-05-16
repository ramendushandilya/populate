package com.shandilya.populate.flipkart.persistence.services.impl;

import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.Repository.*;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import com.shandilya.populate.flipkart.products.camera.model.CameraProducts;
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
    private CameraRepository cameraRepository;

    @Override
    public void saveAcs() {

    }

    @Override
    public void saveAudioPlayers() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("AudioPlayers");
    }

    @Override
    public void saveAutomotive() {
        List<ProductsExt> extProds = aggregatorService.getAllProducts("Automotive");
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

    }

    @Override
    public void saveCameras() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("Cameras");
        List<CameraProducts> cameras = conversionService.convert(extProds, CameraProducts.class);
        cameraRepository.saveAll(cameras);
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