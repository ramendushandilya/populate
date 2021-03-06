package com.shandilya.populate.flipkart.persistence.services.impl;

import com.shandilya.populate.flipkart.conversioncommon.ListConverter;
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
import com.shandilya.populate.flipkart.products.laptops.models.LaptopsModels;
import com.shandilya.populate.flipkart.products.luggagetravel.models.LuggageTravelProducts;
import com.shandilya.populate.flipkart.products.mensclothing.models.MensClothingProducts;
import com.shandilya.populate.flipkart.products.mensfootwear.models.MensFootwearProducts;
import com.shandilya.populate.flipkart.products.microwaveovens.models.MicrowaveOvenProducts;
import com.shandilya.populate.flipkart.products.mobileaccessories.model.MobileAccessoriesProducts;
import com.shandilya.populate.flipkart.products.mobiles.models.MobileProducts;
import com.shandilya.populate.flipkart.products.musicmoviesposters.models.MusicMoviesPostersProducts;
import com.shandilya.populate.flipkart.products.networkcomponents.models.NetworkComponentProducts;
import com.shandilya.populate.flipkart.products.petsupplies.models.PetSuppliesProducts;
import com.shandilya.populate.flipkart.products.refrigerator.models.RefrigeratorProducts;
import com.shandilya.populate.flipkart.products.software.models.SoftwareProducts;
import com.shandilya.populate.flipkart.products.sportsfitness.models.SportFitnessProducts;
import com.shandilya.populate.flipkart.products.stationaryofficesupplies.models.StationeryProducts;
import com.shandilya.populate.flipkart.products.sunglasses.models.SunglassesProducts;
import com.shandilya.populate.flipkart.products.tableaccessories.models.TabletAccessoriesProducts;
import com.shandilya.populate.flipkart.products.tablets.models.TabletsProducts;
import com.shandilya.populate.flipkart.products.televisions.models.TelevisionProducts;
import com.shandilya.populate.flipkart.products.toys.models.ToysProducts;
import com.shandilya.populate.flipkart.products.tvvideoaccessories.models.TvVideoAccessoriesProducts;
import com.shandilya.populate.flipkart.products.videoplayers.models.VideoPlayersProducts;
import com.shandilya.populate.flipkart.products.washingmachine.models.WashingMachineProducts;
import com.shandilya.populate.flipkart.products.watches.models.WatchesProducts;
import com.shandilya.populate.flipkart.products.wearablesmartdevices.models.WearableSmartDevicesProducts;
import com.shandilya.populate.flipkart.products.womensclothing.models.WomensClothingProducts;
import com.shandilya.populate.flipkart.products.womensfootwear.models.WomensFootwearProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryPersistenceServiceImpl implements CategoryPersistenceService {

    private static final int PAGE_LIMIT = 50;

    private int totalProductsFetched = 0;

    List<ProductsExt> apiProducts;

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

    @Autowired
    private LaptopRepository laptopRepository;

    @Autowired
    private LuggageTravelRepository luggageTravelRepository;

    @Autowired
    private MensClothingRespository mensClothingRespository;

    @Autowired
    private MensFootwearRepository mensFootwearRepository;

    @Autowired
    private MicrowaveOvenRepository microwaveOvenRepository;

    @Autowired
    private MobileAccessoriesRepository mobileAccessoriesRepository;

    @Autowired
    private MobilesRepository mobilesRepository;

    @Autowired
    private MusicMoviesPostersRepository musicMoviesPostersRepository;

    @Autowired
    private NetworkComponentRepository networkComponentRepository;

    @Autowired
    private PetSuppliesRepository petSuppliesRepository;

    @Autowired
    private RefrigeratorRepository refrigeratorRepository;

    @Autowired
    private SoftwareRepository softwareRepository;

    @Autowired
    private SportsFitnessRepository sportsFitnessRepository;

    @Autowired
    private StationeryRepository stationeryRepository;

    @Autowired
    private SunglassesRepository sunglassesRepository;

    @Autowired
    private TabAccRepository tabAccRepository;

    @Autowired
    private TabletRepository tabletRepository;

    @Autowired
    private TelevisionRepository televisionRepository;

    @Autowired
    private ToyRepository toyRepository;

    @Autowired
    private TvVideoAccessoriesRepository tvVideoAccessoriesRepository;

    @Autowired
    private VideoPlayersRepository videoPlayersRepository;

    @Autowired
    private WashingMachineRepository washingMachineRepository;

    @Autowired
    private WatchesRepository watchesRepository;

    @Autowired
    private WearableSmartDevicesRepository wearableSmartDevicesRepository;

    @Autowired
    private WomensClothingRepository womensClothingRepository;

    @Autowired
    private WomensFootwearRepository womensFootwearRepository;

    @Override
    public void saveAcs() {

        apiProducts = aggregatorService.getAllProducts("AirConditioners", PAGE_LIMIT);
        List<AirconditionerProducts> airconditionerProducts = conversionService.convert(apiProducts,
                AirconditionerProducts.class);
        acRepository.saveAll(airconditionerProducts);
        totalProductsFetched += apiProducts.size();
        System.out.printf("total ac= "+totalProductsFetched);
        apiProducts.clear();

    }

    @Override
    public void saveAircoolers() {

        apiProducts = aggregatorService.getAllProducts("AirCoolers", PAGE_LIMIT);
        List<AircoolerProducts> aircoolerProducts = conversionService.convert(apiProducts, AircoolerProducts.class);
        aircoolerRepository.saveAll(aircoolerProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveAudioPlayers() {

        apiProducts = aggregatorService.getAllProducts("AudioPlayers", PAGE_LIMIT);
        List<AudioPlayerProducts> audioPlayerProducts = conversionService.convert(apiProducts,
                AudioPlayerProducts.class);
        audioPlayerRepository.saveAll(audioPlayerProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveAutomotive() {

        apiProducts = aggregatorService.getAllProducts("Automotive", PAGE_LIMIT);
        List<AutomotiveProducts> automotiveProducts = conversionService.convert(apiProducts, AutomotiveProducts.class);
        automotiveRepository.saveAll(automotiveProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveBabyCare() {

        apiProducts = aggregatorService.getAllProducts("BabyCare", PAGE_LIMIT);
        List<BabycareProducts> babycareProducts = conversionService.convert(apiProducts, BabycareProducts.class);
        babycareRepository.saveAll(babycareProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveBagsWalletsBelts() {

        apiProducts = aggregatorService.getAllProducts("BagsWalletsBelts", PAGE_LIMIT);
        List<BagsWalletsBelts> bagsWalletsBelts = conversionService.convert(apiProducts, BagsWalletsBelts.class);
        bagsWalletRepository.saveAll(bagsWalletsBelts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveCameraAccessories() {

        apiProducts = aggregatorService.getAllProducts("CameraAccessories", PAGE_LIMIT);
        List<CameraAccessories> cameraAccessories = conversionService.convert(apiProducts, CameraAccessories.class);
        cameraAccessoriesRepository.saveAll(cameraAccessories);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveCameras() {

        apiProducts = aggregatorService.getAllProducts("Cameras", PAGE_LIMIT);
        List<CameraProducts> cameras = conversionService.convert(apiProducts, CameraProducts.class);
        cameraRepository.saveAll(cameras);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveComputerComponents() {

        apiProducts = aggregatorService.getAllProducts("ComputerComponents", PAGE_LIMIT);
        List<ComputerComponentsProducts> computerComponentsProducts = conversionService.convert(apiProducts,
                ComputerComponentsProducts.class);
        computerComponentsRepository.saveAll(computerComponentsProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveComputerPeripherals() {

        apiProducts = aggregatorService.getAllProducts("ComputerPeripherals", PAGE_LIMIT);
        List<ComputerPeripheralsProducts> computerPeripheralsProducts = conversionService.convert(apiProducts,
                ComputerPeripheralsProducts.class);
        computerPeripheralsRepository.saveAll(computerPeripheralsProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveComputerStorage() {

        apiProducts = aggregatorService.getAllProducts("ComputerStorage", PAGE_LIMIT);
        List<ComputerStorageProducts> computerStorageProducts = conversionService.convert(apiProducts,
                ComputerStorageProducts.class);
        computerStorageRepository.saveAll(computerStorageProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveDesktops() {

        apiProducts = aggregatorService.getAllProducts("Desktops", PAGE_LIMIT);
        List<DesktopProducts> desktopProducts = conversionService.convert(apiProducts, DesktopProducts.class);
        desktopRepository.saveAll(desktopProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveELearning() {
        apiProducts = aggregatorService.getAllProducts("ELearning", PAGE_LIMIT);
        List<ElearningProducts> elearningProducts = conversionService.convert(apiProducts, ElearningProducts.class);
        elearningRepository.saveAll(elearningProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveEyewear() {

        apiProducts = aggregatorService.getAllProducts("Eyewear", PAGE_LIMIT);
        List<EyewearProducts> eyewearProducts = conversionService.convert(apiProducts, EyewearProducts.class);
        eyewearRepository.saveAll(eyewearProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveFoodNutrition() {

        apiProducts = aggregatorService.getAllProducts("FoodNutritionProducts", PAGE_LIMIT);
        List<FoodNutritionProducts> foodNutritionProducts = conversionService.convert(apiProducts,
                FoodNutritionProducts.class);
        foodNutritionRepository.saveAll(foodNutritionProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveFragrances() {

        apiProducts = aggregatorService.getAllProducts("Fragrances", PAGE_LIMIT);
        List<FragranceProducts> fragranceProducts = conversionService.convert(apiProducts, FragranceProducts.class);
        fragranceRepository.saveAll(fragranceProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveFurniture() {
        apiProducts = aggregatorService.getAllProducts("Furniture", PAGE_LIMIT);
        List<FurnitureProducts> furnitureProducts = conversionService.convert(apiProducts, FurnitureProducts.class);
        furnitureRespository.saveAll(furnitureProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveGaming() {

        apiProducts = aggregatorService.getAllProducts("Gaming", PAGE_LIMIT);
        List<GamingProducts> gamingProducts = conversionService.convert(apiProducts, GamingProducts.class);
        gamingRepository.saveAll(gamingProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveGroomingWellness() {

        apiProducts = aggregatorService.getAllProducts("GroomingBeautyWellness", PAGE_LIMIT);
        List<BeautyProducts> beautyProducts = conversionService.convert(apiProducts, BeautyProducts.class);
        beautyProductsRepository.saveAll(beautyProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveHomeAppliances() {
        apiProducts = aggregatorService.getAllProducts("HomeAppliances", PAGE_LIMIT);
        List<HomeApplianceProducts> homeApplianceProducts = conversionService.convert(apiProducts,
                HomeApplianceProducts.class);
        homeApplianceRepository.saveAll(homeApplianceProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveHomeFestiveNeeds() {

        apiProducts = aggregatorService.getAllProducts("HomeDecorAndFestiveNeeds", PAGE_LIMIT);
        List<HomeDecorProducts> homeDecorProducts = conversionService.convert(apiProducts, HomeDecorProducts.class);
        homeDecorRepository.saveAll(homeDecorProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveHomeEntertainment() {

        apiProducts = aggregatorService.getAllProducts("HomeEntertainment", PAGE_LIMIT);
        List<HomeEntertainmentProducts> homeEntertainmentProducts = conversionService.convert(apiProducts,
                HomeEntertainmentProducts.class);
        homeEntertainmentRepository.saveAll(homeEntertainmentProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void savehomeFurnishing() {

        apiProducts = aggregatorService.getAllProducts("HomeFurnishing", PAGE_LIMIT);
        List<HomeFurnishingProducts> homeFurnishingProducts = conversionService.convert(apiProducts,
                HomeFurnishingProducts.class);
        homeFurnishingRepository.saveAll(homeFurnishingProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveHomeImprovementTools() {

        apiProducts = aggregatorService.getAllProducts("HomeImprovementTools", PAGE_LIMIT);
        List<HomeImprovementProducts> homeImprovementProducts = conversionService.convert(apiProducts,
                HomeImprovementProducts.class);
        homeImprovementToolsRepository.saveAll(homeImprovementProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();

    }

    @Override
    public void saveHomeKitchenNeeds() {

        apiProducts = aggregatorService.getAllProducts("HomeAndKitchenNeeds", PAGE_LIMIT);
        List<HomeKitchenProducts> homeKitchenProducts = conversionService.convert(apiProducts,
                HomeKitchenProducts.class);
        homeKitchenNeedsRepository.saveAll(homeKitchenProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveHouseHoldSupplies() {

        apiProducts = aggregatorService.getAllProducts("HouseholdSupplies", PAGE_LIMIT);
        List<HouseHoldSuppliesProducts> houseHoldSuppliesProducts = conversionService.convert(apiProducts,
                HouseHoldSuppliesProducts.class);
        houseHoldSuppliesRepository.saveAll(houseHoldSuppliesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveJewellery() {

        apiProducts = aggregatorService.getAllProducts("Jewellery", PAGE_LIMIT);
        List<JewelleryProducts> jewelleryProducts = conversionService.convert(apiProducts, JewelleryProducts.class);
        jewelleryRepository.saveAll(jewelleryProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveKidsClothing() {

        apiProducts = aggregatorService.getAllProducts("KidsClothing", PAGE_LIMIT);
        List<KidsClothingProducts> kidsClothingProducts = conversionService.convert(apiProducts,
                KidsClothingProducts.class);
        kidsClothingRepository.saveAll(kidsClothingProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveKidsFootwear() {

        apiProducts = aggregatorService.getAllProducts("KidsFootwear", PAGE_LIMIT);
        List<KidsFootwearProducts> kidsFootwearProducts = conversionService.convert(apiProducts,
                KidsFootwearProducts.class);
        kidsFootwearRepository.saveAll(kidsFootwearProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveKitchenAppliances() {

        apiProducts = aggregatorService.getAllProducts("KitchenAppliances",
                PAGE_LIMIT);
        List<KitchenApplianceProducts> kitchenApplianceProducts = conversionService.convert(apiProducts,
                KitchenApplianceProducts.class);
        kitchenAppliancesRepository.saveAll(kitchenApplianceProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveLandLinePhones() {

        apiProducts = aggregatorService.getAllProducts("LandlinePhones", PAGE_LIMIT);
        List<LandLinePhoneProducts> landLinePhoneProducts = conversionService.convert(apiProducts,
                LandLinePhoneProducts.class);
        landLinePhoneRepository.saveAll(landLinePhoneProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveLaptopAccessories() {

        apiProducts = aggregatorService.getAllProducts("LaptopAccessories", PAGE_LIMIT);
        List<LaptopAccessoriesProducts> laptopAccessoriesProducts = conversionService.convert(apiProducts,
                LaptopAccessoriesProducts.class);
        laptopAccessoriesRepository.saveAll(laptopAccessoriesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveLaptops() {

        apiProducts = aggregatorService.getAllProducts("Laptops", PAGE_LIMIT);
        List<LaptopsModels> laptopsModels = conversionService.convert(apiProducts, LaptopsModels.class);
        laptopRepository.saveAll(laptopsModels);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveLuggageTravel() {

        apiProducts = aggregatorService.getAllProducts("LuggageTravel", PAGE_LIMIT);
        List<LuggageTravelProducts> luggageTravelProducts = conversionService.convert(apiProducts,
                LuggageTravelProducts.class);
        luggageTravelRepository.saveAll(luggageTravelProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveMensClothing() {

        apiProducts = aggregatorService.getAllProducts("MensClothing", PAGE_LIMIT);
        List<MensClothingProducts> mensClothingProducts = conversionService.convert(apiProducts,
                MensClothingProducts.class);
        mensClothingRespository.saveAll(mensClothingProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveMensFootwear() {

        apiProducts = aggregatorService.getAllProducts("MensFootwear", PAGE_LIMIT);
        List<MensFootwearProducts> mensFootwearProducts = conversionService.convert(apiProducts,
                MensFootwearProducts.class);
        mensFootwearRepository.saveAll(mensFootwearProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveMicrowaveOvens() {

        apiProducts = aggregatorService.getAllProducts("MicrowaveOvens", PAGE_LIMIT);
        List<MicrowaveOvenProducts> microwaveOvenProducts = conversionService.convert(apiProducts,
                MicrowaveOvenProducts.class);
        microwaveOvenRepository.saveAll(microwaveOvenProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveMobileAccessories() {

        apiProducts = aggregatorService.getAllProducts("MobileAccessories", PAGE_LIMIT);
        List<MobileAccessoriesProducts> mobileAccessoriesProducts = conversionService.convert(apiProducts,
                MobileAccessoriesProducts.class);
        mobileAccessoriesRepository.saveAll(mobileAccessoriesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveMobiles() {

        apiProducts = aggregatorService.getAllProducts("Mobiles", PAGE_LIMIT);
        List<MobileProducts> mobileProducts = conversionService.convert(apiProducts, MobileProducts.class);
        mobilesRepository.saveAll(mobileProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveMusicMoviePosters() {

        apiProducts = aggregatorService.getAllProducts("MusicMoviesPosters", PAGE_LIMIT);
        List<MusicMoviesPostersProducts> musicMoviesPostersProducts = conversionService.convert(apiProducts,
                MusicMoviesPostersProducts.class);
        musicMoviesPostersRepository.saveAll(musicMoviesPostersProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveNetworkComponents() {

        apiProducts = aggregatorService.getAllProducts("NetworkComponents", PAGE_LIMIT);
        List<NetworkComponentProducts> networkComponentProducts = conversionService.convert(apiProducts,
                NetworkComponentProducts.class);
        networkComponentRepository.saveAll(networkComponentProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void savePetSupplies() {

        apiProducts = aggregatorService.getAllProducts("PetSupplies", PAGE_LIMIT);
        List<PetSuppliesProducts> petSuppliesProducts = conversionService.convert(apiProducts,
                PetSuppliesProducts.class);
        petSuppliesRepository.saveAll(petSuppliesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveRefrigerator() {
        apiProducts = aggregatorService.getAllProducts("Refrigerator", PAGE_LIMIT);
        List<RefrigeratorProducts> refrigeratorProducts = conversionService.convert(apiProducts,
                RefrigeratorProducts.class);
        refrigeratorRepository.saveAll(refrigeratorProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveSoftware() {

        apiProducts = aggregatorService.getAllProducts("Software", PAGE_LIMIT);
        List<SoftwareProducts> softwareProducts = conversionService.convert(apiProducts, SoftwareProducts.class);
        softwareRepository.saveAll(softwareProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveSportsFitness() {

        apiProducts = aggregatorService.getAllProducts("SportsFitness", PAGE_LIMIT);
        List<SportFitnessProducts> sportFitnessProducts = conversionService.convert(apiProducts,
                SportFitnessProducts.class);
        sportsFitnessRepository.saveAll(sportFitnessProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveStationeryOfficeSupplies() {

        apiProducts = aggregatorService.getAllProducts("StationeryOfficeSupplies", PAGE_LIMIT);
        List<StationeryProducts> stationeryProducts = conversionService.convert(apiProducts, StationeryProducts.class);
        stationeryRepository.saveAll(stationeryProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveSunglasses() {

        apiProducts = aggregatorService.getAllProducts("Sunglasses", PAGE_LIMIT);
        List<SunglassesProducts> sunglassesProducts = conversionService.convert(apiProducts, SunglassesProducts.class);
        sunglassesRepository.saveAll(sunglassesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveTabletAccessories() {

        apiProducts = aggregatorService.getAllProducts("TabletAccessoriesProducts", PAGE_LIMIT);
        List<TabletAccessoriesProducts> tabletAccessoriesProducts = conversionService.convert(apiProducts,
                TabletAccessoriesProducts.class);
        tabAccRepository.saveAll(tabletAccessoriesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveTablets() {

        apiProducts = aggregatorService.getAllProducts("Tablets", PAGE_LIMIT);
        List<TabletsProducts> tabletsProducts = conversionService.convert(apiProducts, TabletsProducts.class);
        tabletRepository.saveAll(tabletsProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveTelevisions() {
        apiProducts = aggregatorService.getAllProducts("Televisions", PAGE_LIMIT);
        List<TelevisionProducts> televisionProducts = conversionService.convert(apiProducts, TelevisionProducts.class);
        televisionRepository.saveAll(televisionProducts);
        totalProductsFetched += apiProducts.size();
    }

    @Override
    public void saveToys() {

        apiProducts = aggregatorService.getAllProducts("Toys", PAGE_LIMIT);
        List<ToysProducts> toysProducts = conversionService.convert(apiProducts, ToysProducts.class);
        toyRepository.saveAll(toysProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveTvVideoAccessories() {

        apiProducts = aggregatorService.getAllProducts("TvVideoAccessories", PAGE_LIMIT);
        List<TvVideoAccessoriesProducts> tvVideoAccessoriesProducts = conversionService.convert(apiProducts,
                TvVideoAccessoriesProducts.class);
        tvVideoAccessoriesRepository.saveAll(tvVideoAccessoriesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveVideoPlayers() {

        apiProducts = aggregatorService.getAllProducts("VideoPlayers", PAGE_LIMIT);
        List<VideoPlayersProducts> videoPlayersProducts = conversionService.convert(apiProducts,
                VideoPlayersProducts.class);
        videoPlayersRepository.saveAll(videoPlayersProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveWashingMachines() {
        apiProducts = aggregatorService.getAllProducts("WashingMachine", PAGE_LIMIT);
        List<WashingMachineProducts> washingMachineProducts = conversionService.convert(apiProducts,
                WashingMachineProducts.class);
        washingMachineRepository.saveAll(washingMachineProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveWatches() {

        apiProducts = aggregatorService.getAllProducts("Watches", PAGE_LIMIT);
        List<WatchesProducts> watchesProducts = conversionService.convert(apiProducts, WatchesProducts.class);
        watchesRepository.saveAll(watchesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveWearableSmartDevices() {

        apiProducts = aggregatorService.getAllProducts("WearableSmartDevices", PAGE_LIMIT);
        List<WearableSmartDevicesProducts> wearableSmartDevicesProducts = conversionService.convert(apiProducts,
                WearableSmartDevicesProducts.class);
        wearableSmartDevicesRepository.saveAll(wearableSmartDevicesProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveWomenFootwear() {

        apiProducts = aggregatorService.getAllProducts("WomensFootwear", PAGE_LIMIT);
        List<WomensFootwearProducts> womensFootwearProducts = conversionService.convert(apiProducts,
                WomensFootwearProducts.class);
        womensFootwearRepository.saveAll(womensFootwearProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public void saveWomenClothing() {

        apiProducts = aggregatorService.getAllProducts("WomensClothing", PAGE_LIMIT);
        List<WomensClothingProducts> womensClothingProducts = conversionService.convert(apiProducts,
                WomensClothingProducts.class);
        womensClothingRepository.saveAll(womensClothingProducts);
        totalProductsFetched += apiProducts.size();
        apiProducts.clear();
    }

    @Override
    public int getTotalProductsFetched() {
        return totalProductsFetched;
    }
}