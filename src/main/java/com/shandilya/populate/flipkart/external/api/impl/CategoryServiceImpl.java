package com.shandilya.populate.flipkart.external.api.impl;

import com.shandilya.populate.flipkart.external.api.CategoryService;
import com.shandilya.populate.flipkart.external.client.PrepareClientService;
import com.shandilya.populate.flipkart.external.common.Constants;
import com.shandilya.populate.flipkart.external.domains.categories.Listings;
import com.shandilya.populate.flipkart.external.domains.categories.ProductFeed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author failedOptimus
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private PrepareClientService clientService;

    @Override
    public Map<String, String> getProductCategoryUrls() {

        RestTemplate template = new RestTemplate();
        Map<String, String > productCategories = new LinkedHashMap<>();
        HttpHeaders headers = clientService.prepareHeader();
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<ProductFeed> categories = template.exchange(Constants.SEED_URL.toString(),
                HttpMethod.GET, entity, ProductFeed.class);
        Listings listings = categories.getBody().getGroup().getAffiliate().getListings();

        if(categories.getStatusCodeValue() != 200) {
            System.out.println("ERROR");
        } else {
            productCategories.put("AirConditioners", listings.getAirConditioners().getVariants().getCore().getGet());
            productCategories.put("AirCoolers", listings.getAirCoolers().getVariants().getCore().getGet());
            productCategories.put("AudioPlayers", listings.getAudioPlayers().getVariants().getCore().getGet());
            productCategories.put("Automotive", listings.getAutomotive().getVariants().getCore().getGet());
            productCategories.put("BabyCare", listings.getBabyCare().getVariants().getCore().getGet());
            productCategories.put("BagsWalletsBelts", listings.getBagsWalletsBelts().getVariants().getCore().getGet());
            productCategories.put("CameraAccessories", listings.getCameraAccessories().getVariants().getCore().getGet());
            productCategories.put("Cameras", listings.getCameras().getVariants().getCore().getGet());
            productCategories.put("ComputerComponents", listings.getComputerComponents().getVariants().getCore().getGet());
            productCategories.put("ComputerPeripherals", listings.getComputerPeripherals().getVariants().getCore().getGet());
            productCategories.put("ComputerStorage", listings.getComputerStorage().getVariants().getCore().getGet());
            productCategories.put("Desktops", listings.getDesktops().getVariants().getCore().getGet());
            productCategories.put("ELearning", listings.geteLearning().getVariants().getCore().getGet());
            productCategories.put("Eyewear", listings.getEyewear().getVariants().getCore().getGet());
            productCategories.put("FoodNutritionProducts", listings.getFoodNutrition().getVariants().getCore().getGet());
            productCategories.put("Fragrances", listings.getFragrances().getVariants().getCore().getGet());
            productCategories.put("Furniture", listings.getFurniture().getVariants().getCore().getGet());
            productCategories.put("Gaming", listings.getGaming().getVariants().getCore().getGet());
            productCategories.put("GroomingBeautyWellness", listings.getGroomingBeautyWellness().getVariants().getCore().getGet());
            productCategories.put("HomeAndKitchenNeeds", listings.getHomeAndKitchenNeeds().getVariants().getCore().getGet());
            productCategories.put("HomeAppliances", listings.getHomeAppliances().getVariants().getCore().getGet());
            productCategories.put("HomeDecorAndFestiveNeeds", listings.getDecorAndFestiveNeeds().getVariants().getCore().getGet());
            productCategories.put("HomeEntertainment", listings.getHomeEntertainment().getVariants().getCore().getGet());
            productCategories.put("HomeFurnishing", listings.getHomeFurnishing().getVariants().getCore().getGet());
            productCategories.put("HomeImprovementTools", listings.getHomeImprovementTools().getVariants().getCore().getGet());
            productCategories.put("HouseholdSupplies", listings.getHouseholdSupplies().getVariants().getCore().getGet());
            productCategories.put("Jewellery", listings.getJewellery().getVariants().getCore().getGet());
            productCategories.put("KidsClothing", listings.getKidsClothing().getVariants().getCore().getGet());
            productCategories.put("KidsFootwear", listings.getKidsFootwear().getVariants().getCore().getGet());
            productCategories.put("KitchenAppliances", listings.getKitchenAppliances().getVariants().getCore().getGet());
            productCategories.put("LandlinePhones", listings.getLandlinePhones().getVariants().getCore().getGet());
            productCategories.put("LaptopAccessories", listings.getLaptopAccessories().getVariants().getCore().getGet());
            productCategories.put("Laptops", listings.getLaptops().getVariants().getCore().getGet());
            productCategories.put("LuggageTravel", listings.getLuggageTravel().getVariants().getCore().getGet());
            productCategories.put("MensClothing", listings.getMensClothing().getVariants().getCore().getGet());
            productCategories.put("MensFootwear", listings.getMensFootwear().getVariants().getCore().getGet());
            productCategories.put("MicrowaveOvens", listings.getMicrowaveOvens().getVariants().getCore().getGet());
            productCategories.put("MobileAccessories", listings.getMobileAccessories().getVariants().getCore().getGet());
            productCategories.put("Mobiles", listings.getMobiles().getVariants().getCore().getGet());
            productCategories.put("MusicMoviesPosters", listings.getMusicMoviesPosters().getVariants().getCore().getGet());
            productCategories.put("NetworkComponents", listings.getNetworkComponents().getVariants().getCore().getGet());
            productCategories.put("PetSupplies", listings.getPetSupplies().getVariants().getCore().getGet());
            productCategories.put("Refrigerator", listings.getRefrigerator().getVariants().getCore().getGet());
            productCategories.put("Software", listings.getSoftware().getVariants().getCore().getGet());
            productCategories.put("SportsFitness", listings.getSportsFitness().getVariants().getCore().getGet());
            productCategories.put("StationeryOfficeSupplies", listings.getStationeryOfficeSupplies().getVariants().getCore().getGet());
            productCategories.put("Sunglasses", listings.getSunglasses().getVariants().getCore().getGet());
            productCategories.put("TabletAccessories", listings.getTabletAccessories().getVariants().getCore().getGet());
            productCategories.put("Tablets", listings.getTablets().getVariants().getCore().getGet());
            productCategories.put("Televisions", listings.getTelevisions().getVariants().getCore().getGet());
            productCategories.put("Toys", listings.getToys().getVariants().getCore().getGet());
            productCategories.put("TvVideoAccessories", listings.getTvVideoAccessories().getVariants().getCore().getGet());
            productCategories.put("VideoPlayers", listings.getVideoPlayers().getVariants().getCore().getGet());
            productCategories.put("WashingMachine", listings.getWashingMachine().getVariants().getCore().getGet());
            productCategories.put("Watches", listings.getWatches().getVariants().getCore().getGet());
            productCategories.put("WearableSmartDevices", listings.getWearableSmartDevices().getVariants().getCore().getGet());
            productCategories.put("WomensClothing", listings.getWomensClothing().getVariants().getCore().getGet());
            productCategories.put("WomensFootwear", listings.getWomensFootwear().getVariants().getCore().getGet());
        }

        return productCategories;
    }
}
