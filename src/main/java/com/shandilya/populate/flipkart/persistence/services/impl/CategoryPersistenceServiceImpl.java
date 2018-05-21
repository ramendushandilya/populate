package com.shandilya.populate.flipkart.persistence.services.impl;

import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.Repository.*;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import com.shandilya.populate.flipkart.products.airconditioners.model.AirconditionerProducts;
import com.shandilya.populate.flipkart.products.aircoolers.model.AircoolerProducts;
import com.shandilya.populate.flipkart.products.audioplayers.model.AudioPlayerProducts;
import com.shandilya.populate.flipkart.products.automotive.model.AutomotiveProducts;
import com.shandilya.populate.flipkart.products.babycare.model.BabycareProducts;
import com.shandilya.populate.flipkart.products.bagswalletsbelts.model.BagsWalletsBelts;
import com.shandilya.populate.flipkart.products.camera.model.CameraProducts;
import com.shandilya.populate.flipkart.products.cameraAccessories.model.CameraAccessories;
import com.shandilya.populate.flipkart.products.computercomponents.model.ComputerComponentsProducts;
import com.shandilya.populate.flipkart.products.computerperipherals.model.ComputerPeripheralsProducts;
import com.shandilya.populate.flipkart.products.computerstorage.model.ComputerStorageProducts;
import com.shandilya.populate.flipkart.products.desktops.models.DesktopProducts;
import com.shandilya.populate.flipkart.products.elearning.models.ElearningProducts;
import com.shandilya.populate.flipkart.products.eyewear.models.EyewearProducts;
import com.shandilya.populate.flipkart.products.foodnutrition.models.FoodNutritionProducts;
import com.shandilya.populate.flipkart.products.fragrances.models.FragranceProducts;
import com.shandilya.populate.flipkart.products.furniture.models.FurnitureProducts;
import com.shandilya.populate.flipkart.products.gaming.models.GamingProducts;
import com.shandilya.populate.flipkart.products.groomingbeautywellness.models.BeautyProducts;
import com.shandilya.populate.flipkart.products.homeappliances.models.HomeApplianceProducts;
import com.shandilya.populate.flipkart.products.homedecorandfestiveneeds.models.HomeDecorProducts;
import com.shandilya.populate.flipkart.products.homeentertainment.models.HomeEntertainmentProducts;
import com.shandilya.populate.flipkart.products.homefurnishing.models.HomeFurnishingProducts;
import com.shandilya.populate.flipkart.products.homeimprovementtools.models.HomeImprovementProducts;
import com.shandilya.populate.flipkart.products.homekitchenneeds.models.HomeKitchenProducts;
import com.shandilya.populate.flipkart.products.householdsupplies.models.HouseHoldSuppliesProducts;
import com.shandilya.populate.flipkart.products.jewellery.models.JewelleryProducts;
import com.shandilya.populate.flipkart.products.kidsclothing.models.KidsClothingProducts;
import com.shandilya.populate.flipkart.products.kidsfootwear.models.KidsFootwearProducts;
import com.shandilya.populate.flipkart.products.kitchenappliances.models.KitchenApplianceProducts;
import com.shandilya.populate.flipkart.products.landlinephones.models.LandLinePhoneProducts;
import com.shandilya.populate.flipkart.products.laptopaccessories.models.LaptopAccessoriesProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryPersistenceServiceImpl implements CategoryPersistenceService {

    private static final int PAGE_LIMIT = 50;

    @Autowired
    private PopulateConversionService conversionService;

    @Autowired
    private ProductUrlAggregatorService aggregatorService;

    @Autowired
    private AcRepository acRepository;

    @Autowired
    private AircoolerRepository aircoolerRepository;

    @Autowired
    private AudioPlayerRepository audioPlayerRepository;

    @Autowired
    private AutomotiveRepository automotiveRepository;

    @Autowired
    private BabycareRepository babycareRepository;

    @Autowired
    private BagsWalletRepository bagsWalletRepository;

    @Autowired
    private CameraRepository cameraRepository;

    @Autowired
    private CameraAccessoriesRepository cameraAccessoriesRepository;

    @Autowired
    private ComputerComponentsRepository computerComponentsRepository;

    @Autowired
    private ComputerPeripheralsRepository computerPeripheralsRepository;

    @Autowired
    private ComputerStorageRepository computerStorageRepository;

    @Autowired
    private DesktopRepository desktopRepository;

    @Autowired
    private ElearningRepository elearningRepository;

    @Autowired
    private EyewearRepository eyewearRepository;

    @Autowired
    private FoodNutritionRepository foodNutritionRepository;

    @Autowired
    private FragranceRepository fragranceRepository;

    @Autowired
    private FurnitureRespository furnitureRespository;

    @Autowired
    private GamingRepository gamingRepository;

    @Autowired
    private BeautyProductsRepository beautyProductsRepository;

    @Autowired
    private HomeApplianceRepository homeApplianceRepository;

    @Autowired
    private HomeDecorRepository homeDecorRepository;

    @Autowired
    private HomeEntertainmentRepository homeEntertainmentRepository;

    @Autowired
    private HomeFurnishingRepository homeFurnishingRepository;

    @Autowired
    private HomeImprovementToolsRepository homeImprovementToolsRepository;

    @Autowired
    private HomeKitchenNeedsRepository homeKitchenNeedsRepository;

    @Autowired
    private HouseHoldSuppliesRepository houseHoldSuppliesRepository;

    @Autowired
    private JewelleryRepository jewelleryRepository;

    @Autowired
    private KidsClothingRepository kidsClothingRepository;

    @Autowired
    private KidsFootwearRepository kidsFootwearRepository;

    @Autowired
    private KitchenAppliancesRepository kitchenAppliancesRepository;

    @Autowired
    private LandLinePhoneRepository landLinePhoneRepository;

    @Autowired
    private LaptopAccessoriesRepository laptopAccessoriesRepository;

    @Override
    public void saveAcs() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("AirConditioners", PAGE_LIMIT);
        List<AirconditionerProducts> airconditionerProducts = conversionService.convert(apiProducts,
                AirconditionerProducts.class);
        acRepository.saveAll(airconditionerProducts);
    }

    @Override
    public void saveAircoolers() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("AirCoolers", PAGE_LIMIT);
        List<AircoolerProducts> aircoolerProducts = conversionService.convert(apiProducts, AircoolerProducts.class);
        aircoolerRepository.saveAll(aircoolerProducts);
    }

    @Override
    public void saveAudioPlayers() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("AudioPlayers", PAGE_LIMIT);
        List<AudioPlayerProducts> audioPlayerProducts = conversionService.convert(apiProducts,
                AudioPlayerProducts.class);
        audioPlayerRepository.saveAll(audioPlayerProducts);
    }

    @Override
    public void saveAutomotive() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Automotive", PAGE_LIMIT);
        List<AutomotiveProducts> automotiveProducts = conversionService.convert(apiProducts, AutomotiveProducts.class);
        automotiveRepository.saveAll(automotiveProducts);
    }

    @Override
    public void saveBabyCare() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("BabyCare", PAGE_LIMIT);
        List<BabycareProducts> babycareProducts = conversionService.convert(apiProducts, BabycareProducts.class);
        babycareRepository.saveAll(babycareProducts);
    }

    @Override
    public void saveBagsWalletsBelts() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("BagsWalletsBelts", PAGE_LIMIT);
        List<BagsWalletsBelts> bagsWalletsBelts = conversionService.convert(apiProducts, BagsWalletsBelts.class);
        bagsWalletRepository.saveAll(bagsWalletsBelts);
    }

    @Override
    public void saveCameraAccessories() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("CameraAccessories", PAGE_LIMIT);
        List<CameraAccessories> cameraAccessories = conversionService.convert(apiProducts, CameraAccessories.class);
        cameraAccessoriesRepository.saveAll(cameraAccessories);
    }

    @Override
    public void saveCameras() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("Cameras", PAGE_LIMIT);
        List<CameraProducts> cameras = conversionService.convert(extProds, CameraProducts.class);
        cameraRepository.saveAll(cameras);
    }

    @Override
    public void saveComputerComponents() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("ComputerComponents", PAGE_LIMIT);
        List<ComputerComponentsProducts> computerComponentsProducts = conversionService.convert(apiProducts,
                ComputerComponentsProducts.class);
        computerComponentsRepository.saveAll(computerComponentsProducts);
    }

    @Override
    public void saveComputerPeripherals() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("ComputerPeripherals", PAGE_LIMIT);
        List<ComputerPeripheralsProducts> computerPeripheralsProducts = conversionService.convert(apiProducts,
                ComputerPeripheralsProducts.class);
        computerPeripheralsRepository.saveAll(computerPeripheralsProducts);
    }

    @Override
    public void saveComputerStorage() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("ComputerStorage", PAGE_LIMIT);
        List<ComputerStorageProducts> computerStorageProducts = conversionService.convert(apiProducts,
                ComputerStorageProducts.class);
        computerStorageRepository.saveAll(computerStorageProducts);
    }

    @Override
    public void saveDesktops() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Desktops", PAGE_LIMIT);
        List<DesktopProducts> desktopProducts = conversionService.convert(apiProducts, DesktopProducts.class);
        desktopRepository.saveAll(desktopProducts);
    }

    @Override
    public void saveELearning() {
        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Elearning", PAGE_LIMIT);
        List<ElearningProducts> elearningProducts = conversionService.convert(apiProducts, ElearningProducts.class);
        elearningRepository.saveAll(elearningProducts);
    }

    @Override
    public void saveEyewear() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Eyewear", PAGE_LIMIT);
        List<EyewearProducts> eyewearProducts = conversionService.convert(apiProducts, EyewearProducts.class);
        eyewearRepository.saveAll(eyewearProducts);
    }

    @Override
    public void saveFoodNutrition() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("FoodNutritionProducts", PAGE_LIMIT);
        List<FoodNutritionProducts> foodNutritionProducts = conversionService.convert(apiProducts,
                FoodNutritionProducts.class);
        foodNutritionRepository.saveAll(foodNutritionProducts);
    }

    @Override
    public void saveFragrances() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Fragrances", PAGE_LIMIT);
        List<FragranceProducts> fragranceProducts = conversionService.convert(apiProducts, FragranceProducts.class);
        fragranceRepository.saveAll(fragranceProducts);
    }

    @Override
    public void saveFurniture() {
        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Furniture", PAGE_LIMIT);
        List<FurnitureProducts> furnitureProducts = conversionService.convert(apiProducts, FurnitureProducts.class);
        furnitureRespository.saveAll(furnitureProducts);
    }

    @Override
    public void saveGaming() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Gaming", PAGE_LIMIT);
        List<GamingProducts> gamingProducts = conversionService.convert(apiProducts, GamingProducts.class);
        gamingRepository.saveAll(gamingProducts);
    }

    @Override
    public void saveGroomingWellness() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("GroomingBeautyWellness", PAGE_LIMIT);
        List<BeautyProducts> beautyProducts = conversionService.convert(apiProducts, BeautyProducts.class);
        beautyProductsRepository.saveAll(beautyProducts);
    }

    @Override
    public void saveHomeAppliances() {
        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HomeAppliances", PAGE_LIMIT);
        List<HomeApplianceProducts> homeApplianceProducts = conversionService.convert(apiProducts,
                HomeApplianceProducts.class);
        homeApplianceRepository.saveAll(homeApplianceProducts);
    }

    @Override
    public void saveHomeFestiveNeeds() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HomeDecorAndFestiveNeeds", PAGE_LIMIT);
        List<HomeDecorProducts> homeDecorProducts = conversionService.convert(apiProducts, HomeDecorProducts.class);
        homeDecorRepository.saveAll(homeDecorProducts);
    }

    @Override
    public void saveHomeEntertainment() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HomeEntertainment", PAGE_LIMIT);
        List<HomeEntertainmentProducts> homeEntertainmentProducts = conversionService.convert(apiProducts,
                HomeEntertainmentProducts.class);
        homeEntertainmentRepository.saveAll(homeEntertainmentProducts);
    }

    @Override
    public void savehomeFurnishing() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HomeFurnishing", PAGE_LIMIT);
        List<HomeFurnishingProducts> homeFurnishingProducts = conversionService.convert(apiProducts,
                HomeFurnishingProducts.class);
        homeFurnishingRepository.saveAll(homeFurnishingProducts);
    }

    @Override
    public void saveHomeImprovementTools() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HomeImprovementTools", PAGE_LIMIT);
        List<HomeImprovementProducts> homeImprovementProducts = conversionService.convert(apiProducts,
                HomeImprovementProducts.class);
        homeImprovementToolsRepository.saveAll(homeImprovementProducts);

    }

    @Override
    public void saveHomeKitchenNeeds() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HomeAndKitchenNeeds", PAGE_LIMIT);
        List<HomeKitchenProducts> homeKitchenProducts = conversionService.convert(apiProducts,
                HomeKitchenProducts.class);
        homeKitchenNeedsRepository.saveAll(homeKitchenProducts);
    }

    @Override
    public void saveHouseHoldSupplies() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("HouseholdSupplies", PAGE_LIMIT);
        List<HouseHoldSuppliesProducts> houseHoldSuppliesProducts = conversionService.convert(apiProducts,
                HouseHoldSuppliesProducts.class);
        houseHoldSuppliesRepository.saveAll(houseHoldSuppliesProducts);
    }

    @Override
    public void saveJewellery() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("Jewellery", PAGE_LIMIT);
        List<JewelleryProducts> jewelleryProducts = conversionService.convert(apiProducts, JewelleryProducts.class);
        jewelleryRepository.saveAll(jewelleryProducts);
    }

    @Override
    public void saveKidsClothing() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("KidsClothing", PAGE_LIMIT);
        List<KidsClothingProducts> kidsClothingProducts = conversionService.convert(apiProducts,
                KidsClothingProducts.class);
        kidsClothingRepository.saveAll(kidsClothingProducts);
    }

    @Override
    public void saveKidsFootwear() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("KidsFootwear", PAGE_LIMIT);
        List<KidsFootwearProducts> kidsFootwearProducts = conversionService.convert(apiProducts,
                KidsFootwearProducts.class);
        kidsFootwearRepository.saveAll(kidsFootwearProducts);
    }

    @Override
    public void saveKitchenAppliances() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("KitchenAppliances",
                PAGE_LIMIT);
        List<KitchenApplianceProducts> kitchenApplianceProducts = conversionService.convert(apiProducts,
                KitchenApplianceProducts.class);
        kitchenAppliancesRepository.saveAll(kitchenApplianceProducts);
    }

    @Override
    public void saveLandLinePhones() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("LandlinePhones", PAGE_LIMIT);
        List<LandLinePhoneProducts> landLinePhoneProducts = conversionService.convert(apiProducts,
                LandLinePhoneProducts.class);
        landLinePhoneRepository.saveAll(landLinePhoneProducts);
    }

    @Override
    public void saveLaptopAccessories() {

        List<ProductsExt> apiProducts = aggregatorService.getAllProducts("LaptopAccessories", PAGE_LIMIT);
        List<LaptopAccessoriesProducts> laptopAccessoriesProducts = conversionService.convert(apiProducts,
                LaptopAccessoriesProducts.class);
        laptopAccessoriesRepository.saveAll(laptopAccessoriesProducts);
    }

    @Override
    public void saveLaptops() {

    }

    @Override
    public void saveLuggageTravel() {

    }

    @Override
    public void saveMensClothing() {

    }

    @Override
    public void saveMensFootwear() {

    }

    @Override
    public void saveMicrowaveOvens() {

    }

    @Override
    public void saveMobileAccessories() {

    }

    @Override
    public void saveMobiles() {

    }

    @Override
    public void savMusicMoviePosters() {

    }

    @Override
    public void saveNetworkComponents() {

    }

    @Override
    public void savePetSupplies() {

    }

    @Override
    public void saveRefrigerator() {

    }

    @Override
    public void saveSoftware() {

    }

    @Override
    public void saveSportsFitness() {

    }

    @Override
    public void saveStationeryOfficeSupplies() {

    }

    @Override
    public void saveSunglasses() {

    }

    @Override
    public void saveTabletAccessories() {

    }

    @Override
    public void saveTablets() {

    }

    @Override
    public void saveTelevisions() {

    }

    @Override
    public void saveToys() {

    }

    @Override
    public void saveTvVideoAccessories() {

    }

    @Override
    public void saveVideoPlayers() {

    }

    @Override
    public void saveWashingMahines() {

    }

    @Override
    public void saveWatches() {

    }

    @Override
    public void saveWearableSmartDevices() {

    }

    @Override
    public void saveWomenFootwear() {

    }

    @Override
    public void saveWomenClothing() {

    }
}