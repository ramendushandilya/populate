package com.shandilya.populate.flipkart.persistence.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shandilya.populate.flipkart.conversioncommon.PopulateConversionService;
import com.shandilya.populate.flipkart.external.api.ProductUrlAggregatorService;
import com.shandilya.populate.flipkart.external.domains.urlcommons.MasterExt;
import com.shandilya.populate.flipkart.external.domains.urlcommons.ProductsExt;
import com.shandilya.populate.flipkart.persistence.Repository.AcRepository;
import com.shandilya.populate.flipkart.persistence.services.CategoryPersistenceService;
import com.shandilya.populate.flipkart.products.airconditioner.model.AcProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryPersistenceServiceImpl implements CategoryPersistenceService {

    @Autowired
    private PopulateConversionService conversionService;

    @Autowired
    private AcRepository acRepository;

    @Autowired
    private ProductUrlAggregatorService aggregatorService;

    @Override
    public void saveAcs() {

        List<ProductsExt> extProds = aggregatorService.getAllProducts("AirConditioners");

        List<AcProducts> prods = conversionService.convert(extProds, AcProducts.class);

        acRepository.saveAll(prods);
    }

    public List<ProductsExt> stubDataGen() {
        List<ProductsExt> prods = null;

        ObjectMapper mapper = new ObjectMapper();
        String json = "{\n" +
                "  \"nextUrl\": \"https://affiliate-api.flipkart.net/affiliate/1.0/feeds/ramendu98/category/j9e-abm-c54/5abcb0c6e43a5edee0e6cebe.json?expiresAt=1522635804191&sig=98088dd6362b9ce1d280e8466c24d2e2\",\n" +
                "  \"validTill\": 1522635804191,\n" +
                "  \"lastProductId\": \"ACNF3H4KV93M2TRW\",\n" +
                "  \"products\": [\n" +
                "    {\n" +
                "      \"productBaseInfoV1\": {\n" +
                "        \"productId\": \"ACNE7TVHYTPNFSPE\",\n" +
                "        \"title\": \"Haier 1.5 Ton 5 Star BEE Rating 2017 Window AC  - Ivory(HW-18CH5CNA)\",\n" +
                "        \"productDescription\": \"\",\n" +
                "        \"imageUrls\": {\n" +
                "          \"200x200\": \"https://rukminim1.flixcart.com/image/200/200/air-conditioner-new/s/p/e/1-5-haier-window-hw-18ch5cna-original-imae9a6rqwbadhjf.jpeg?q=90\",\n" +
                "          \"400x400\": \"https://rukminim1.flixcart.com/image/400/400/air-conditioner-new/s/p/e/1-5-haier-window-hw-18ch5cna-original-imae9a6rqwbadhjf.jpeg?q=90\",\n" +
                "          \"800x800\": \"https://rukminim1.flixcart.com/image/800/800/air-conditioner-new/s/p/e/1-5-haier-window-hw-18ch5cna-original-imae9a6rqwbadhjf.jpeg?q=90\"\n" +
                "        },\n" +
                "        \"productFamily\": [\n" +
                "          \"ACNE7TVHYTPNFSPE\"\n" +
                "        ],\n" +
                "        \"maximumRetailPrice\": {\n" +
                "          \"amount\": 32500,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"flipkartSellingPrice\": {\n" +
                "          \"amount\": 26500,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"flipkartSpecialPrice\": {\n" +
                "          \"amount\": 26000,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"productUrl\": \"https://dl.flipkart.com/dl/haier-1-5-ton-5-star-bee-rating-2017-window-ac-ivory/p/itme7tvhhuxvwxrd?pid=ACNE7TVHYTPNFSPE&affid=ramendu98\",\n" +
                "        \"productBrand\": \"Haier\",\n" +
                "        \"inStock\": true,\n" +
                "        \"codAvailable\": true,\n" +
                "        \"discountPercentage\": 20,\n" +
                "        \"offers\": [\n" +
                "          \"Extra ₹500 Off\",\n" +
                "          \"10% Instant Discount* with HDFC Bank Cards\",\n" +
                "          \"15% Cashback* on payments through PhonePe\",\n" +
                "          \"Extra 5% off* with Axis Bank Buzz Credit Card\"\n" +
                "        ],\n" +
                "        \"categoryPath\": \"Electronics>Appliances>Home Appliances>Air Conditioners\",\n" +
                "        \"attributes\": {\n" +
                "          \"size\": \"\",\n" +
                "          \"color\": \"Ivory\",\n" +
                "          \"storage\": \"\",\n" +
                "          \"sizeUnit\": \"\",\n" +
                "          \"displaySize\": \"\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"productShippingInfoV1\": {\n" +
                "        \"shippingCharges\": {\n" +
                "          \"amount\": 0,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"estimatedDeliveryTime\": \"Usually Delivered in 8 - 9 days.\",\n" +
                "        \"sellerName\": \"Pankaj arora\",\n" +
                "        \"sellerAverageRating\": 3,\n" +
                "        \"sellerNoOfRatings\": 92,\n" +
                "        \"sellerNoOfReviews\": 13\n" +
                "      },\n" +
                "      \"categorySpecificInfoV1\": {\n" +
                "        \"keySpecs\": [\n" +
                "          \"Anti Bacteria Filter\",\n" +
                "          \"Auto Restart\",\n" +
                "          \"Dust Filter\",\n" +
                "          \"Dehumidification\"\n" +
                "        ],\n" +
                "        \"detailedSpecs\": [\n" +
                "          \"Anti Bacteria Filter\",\n" +
                "          \"Auto Restart\",\n" +
                "          \"Dust Filter\",\n" +
                "          \"Dehumidification\"\n" +
                "        ],\n" +
                "        \"specificationList\": [\n" +
                "          {\n" +
                "            \"key\": \"General\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"In The Box\",\n" +
                "                \"value\": [\n" +
                "                  \"1 AC Unit\",\n" +
                "                  \"1 Remote Control\",\n" +
                "                  \"User Manual\",\n" +
                "                  \"Warranty Card\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Brand\",\n" +
                "                \"value\": [\n" +
                "                  \"Haier\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Model Name\",\n" +
                "                \"value\": [\n" +
                "                  \"HW-18CH5CNA\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Type\",\n" +
                "                \"value\": [\n" +
                "                  \"Window\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Capacity in Tons\",\n" +
                "                \"value\": [\n" +
                "                  \"1.5 Ton\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Star Rating\",\n" +
                "                \"value\": [\n" +
                "                  \"5 Star BEE Rating\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Manufacture Year\",\n" +
                "                \"value\": [\n" +
                "                  \"2017\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Color\",\n" +
                "                \"value\": [\n" +
                "                  \"Ivory\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Cooling and Heating\",\n" +
                "                \"value\": [\n" +
                "                  \"No\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Cooling Capacity\",\n" +
                "                \"value\": [\n" +
                "                  \"6600 W\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Compressor\",\n" +
                "                \"value\": [\n" +
                "                  \"Rotary\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Dehumidification\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Remote Control\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Dimensions\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Indoor W x H x D\",\n" +
                "                \"value\": [\n" +
                "                  \"80.5 cm x 43 cm x 66 cm\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Indoor Unit Weight\",\n" +
                "                \"value\": [\n" +
                "                  \"56 kg\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Air Flow & Filter Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Anti-bacteria Filter\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Dust Filter\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Convenience Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Auto Restart\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Additional Features\",\n" +
                "                \"value\": [\n" +
                "                  \"Noise Level: 52 dB\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Power Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Power Requirement\",\n" +
                "                \"value\": [\n" +
                "                  \"AC 230 V, 50 Hz\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Power Consumption\",\n" +
                "                \"value\": [\n" +
                "                  \"1480 W\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Services\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Installation Details\",\n" +
                "                \"value\": [\n" +
                "                  \"Flipkart will facilitate Installation & Demo at time of your convenience from an brand authorized service engineer\",\n" +
                "                  \"Flipkart will communicate the day and time slot of the scheduled Installation & Demo through a SMS and the same information will also be available in your order details page\",\n" +
                "                  \"The Installation of Air-conditioner is charged extra to customer at the time of installation and needs to be paid directly to the service engineer. Standard installation charges for Window AC will be approx Rs. 500-600. Please check the offer details to find out whether free installation offer or any other special offer price is available at the time of purchase or not\",\n" +
                "                  \"Standard Installation of Air-conditioners covers only\",\n" +
                "                  \"a. Drilling of hole in Brick wall for taking out the pipes, b. Fixing hole sleeve & Cap, c. Fixing the Indoor and Outdoor Unit, d. Connecting Indoor and Outdoor units using Standard Kit provided by Manufacturer (at an additional cost, unless specified otherwise), e. Wrapping the pipe with seasoning tape\",\n" +
                "                  \"Not covered as part of standard Installation charges are\",\n" +
                "                  \"a. Out Door Unit Stand, b. Extra copper wire, c.Drain Pipe extension if any, d. Wiring extension from Meter to site, e. Stabilizer required for the installation if available with the technician will be chargeable extra, f. Plumbing and Masonry Work, g. Power-point/MCB fitting and any other electrical work, h. Carpentry work, i. Dismantling/Shifting of Old AC's masonry, j. Core cutting fabrication and electrical\",\n" +
                "                  \"The authorized service engineer will be providing detailed demo that includes\",\n" +
                "                  \"a. Usage of the product, b. Explain all the functionality of the product, c. Preventive maintenance action to be taken\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Technician Visit Details\",\n" +
                "                \"value\": [\n" +
                "                  \"Authorized Service Engineer will do the following\",\n" +
                "                  \"Repair / change the defective part\",\n" +
                "                  \"Provide replacement to the customer in case part/product not repairable (only after replacement request approved)\",\n" +
                "                  \"Repair Services\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Uninstallation Details\",\n" +
                "                \"value\": [\n" +
                "                  \"In case of Returns Flipkart's team will visit the customers location\",\n" +
                "                  \"Uninstall\",\n" +
                "                  \"Pack\",\n" +
                "                  \"Pick-up the product\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Other Included Services\",\n" +
                "                \"value\": [\n" +
                "                  \"Two Free Services of AC within Warranty Period on Demand\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Warranty\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Warranty Summary\",\n" +
                "                \"value\": [\n" +
                "                  \"1 Year on product and 4 Years on compressor\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Covered in Warranty\",\n" +
                "                \"value\": [\n" +
                "                  \"Internal Damages\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Not Covered in Warranty\",\n" +
                "                \"value\": [\n" +
                "                  \"Plastic Parts, Gas Filling\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"booksInfo\": {\n" +
                "          \"language\": null,\n" +
                "          \"binding\": null,\n" +
                "          \"pages\": null,\n" +
                "          \"publisher\": null,\n" +
                "          \"year\": 0,\n" +
                "          \"authors\": []\n" +
                "        },\n" +
                "        \"lifeStyleInfo\": {\n" +
                "          \"sleeve\": null,\n" +
                "          \"neck\": null,\n" +
                "          \"idealFor\": null\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"productBaseInfoV1\": {\n" +
                "        \"productId\": \"ACNE6FS4GDJDNGBA\",\n" +
                "        \"title\": \"Voltas 1.5 Ton 3 Star BEE Rating 2017 Split AC  - Red(183 EYR)\",\n" +
                "        \"productDescription\": \"\",\n" +
                "        \"imageUrls\": {\n" +
                "          \"200x200\": \"https://rukminim1.flixcart.com/image/200/200/air-conditioner-new/g/b/a/1-5-voltas-split-183-eyr-original-imae6gyfbdagky6u.jpeg?q=90\",\n" +
                "          \"400x400\": \"https://rukminim1.flixcart.com/image/400/400/air-conditioner-new/g/b/a/1-5-voltas-split-183-eyr-original-imae6gyfbdagky6u.jpeg?q=90\",\n" +
                "          \"800x800\": \"https://rukminim1.flixcart.com/image/800/800/air-conditioner-new/g/b/a/1-5-voltas-split-183-eyr-original-imae6gyfbdagky6u.jpeg?q=90\"\n" +
                "        },\n" +
                "        \"productFamily\": [\n" +
                "          \"ACNE6FS4GDJDNGBA\"\n" +
                "        ],\n" +
                "        \"maximumRetailPrice\": {\n" +
                "          \"amount\": 40990,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"flipkartSellingPrice\": {\n" +
                "          \"amount\": 33510,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"flipkartSpecialPrice\": {\n" +
                "          \"amount\": 33510,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"productUrl\": \"https://dl.flipkart.com/dl/voltas-1-5-ton-3-star-bee-rating-2017-split-ac-red/p/itme6fs5rhqxgzdy?pid=ACNE6FS4GDJDNGBA&affid=ramendu98\",\n" +
                "        \"productBrand\": \"Voltas\",\n" +
                "        \"inStock\": false,\n" +
                "        \"codAvailable\": true,\n" +
                "        \"discountPercentage\": 18,\n" +
                "        \"offers\": [\n" +
                "          \"10% Instant Discount* with HDFC Bank Cards\",\n" +
                "          \"15% Cashback* on payments through PhonePe\",\n" +
                "          \"Extra 5% off* with Axis Bank Buzz Credit Card\"\n" +
                "        ],\n" +
                "        \"categoryPath\": \"Electronics>Appliances>Home Appliances>Air Conditioners\",\n" +
                "        \"attributes\": {\n" +
                "          \"size\": \"\",\n" +
                "          \"color\": \"Red\",\n" +
                "          \"storage\": \"\",\n" +
                "          \"sizeUnit\": \"\",\n" +
                "          \"displaySize\": \"\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"productShippingInfoV1\": {\n" +
                "        \"shippingCharges\": {\n" +
                "          \"amount\": 0,\n" +
                "          \"currency\": \"INR\"\n" +
                "        },\n" +
                "        \"estimatedDeliveryTime\": \"\",\n" +
                "        \"sellerName\": \"VIVEKS LIMITED\",\n" +
                "        \"sellerAverageRating\": 3.8,\n" +
                "        \"sellerNoOfRatings\": 253,\n" +
                "        \"sellerNoOfReviews\": 23\n" +
                "      },\n" +
                "      \"categorySpecificInfoV1\": {\n" +
                "        \"keySpecs\": [\n" +
                "          \"Anti Bacteria Filter\",\n" +
                "          \"Auto Restart\",\n" +
                "          \"Dust Filter\",\n" +
                "          \"Dehumidification\",\n" +
                "          \"Sleep Mode\"\n" +
                "        ],\n" +
                "        \"detailedSpecs\": [\n" +
                "          \"Anti Bacteria Filter\",\n" +
                "          \"Auto Restart\",\n" +
                "          \"Dust Filter\",\n" +
                "          \"Dehumidification\",\n" +
                "          \"Sleep Mode\"\n" +
                "        ],\n" +
                "        \"specificationList\": [\n" +
                "          {\n" +
                "            \"key\": \"General\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"In The Box\",\n" +
                "                \"value\": [\n" +
                "                  \"1 Indoor Unit\",\n" +
                "                  \"1 Outdoor Unit\",\n" +
                "                  \"1 Remote Control\",\n" +
                "                  \"User Manual\",\n" +
                "                  \"Warranty Card\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Brand\",\n" +
                "                \"value\": [\n" +
                "                  \"Voltas\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Model Name\",\n" +
                "                \"value\": [\n" +
                "                  \"183 EYR\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Type\",\n" +
                "                \"value\": [\n" +
                "                  \"Split\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Capacity in Tons\",\n" +
                "                \"value\": [\n" +
                "                  \"1.5 Ton\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Star Rating\",\n" +
                "                \"value\": [\n" +
                "                  \"3 Star BEE Rating\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Manufacture Year\",\n" +
                "                \"value\": [\n" +
                "                  \"2017\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Color\",\n" +
                "                \"value\": [\n" +
                "                  \"Red\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Series\",\n" +
                "                \"value\": [\n" +
                "                  \"Yr Series\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Cooling and Heating\",\n" +
                "                \"value\": [\n" +
                "                  \"No\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Cooling Capacity\",\n" +
                "                \"value\": [\n" +
                "                  \"4850 W\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Compressor\",\n" +
                "                \"value\": [\n" +
                "                  \"High EER Rotary\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Dehumidification\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Remote Control\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Refrigerant\",\n" +
                "                \"value\": [\n" +
                "                  \"R-22\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Dimensions\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Indoor W x H x D\",\n" +
                "                \"value\": [\n" +
                "                  \"86 cm x 29.2 cm x 20.5 cm\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Indoor Unit Weight\",\n" +
                "                \"value\": [\n" +
                "                  \"10 kg\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Outdoor W x H x D\",\n" +
                "                \"value\": [\n" +
                "                  \"84 cm x 54 cm x 30 cm\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Outdoor Unit Weight\",\n" +
                "                \"value\": [\n" +
                "                  \"34.5 kg\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Performance Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Indoor Noise Level\",\n" +
                "                \"value\": [\n" +
                "                  \"High - 43 dB, Low - 37 dB\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Panel Display\",\n" +
                "                \"value\": [\n" +
                "                  \"LED\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Turbo Mode\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"EER\",\n" +
                "                \"value\": [\n" +
                "                  \"3 W/W\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Body and Design Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Other Body and Design Features\",\n" +
                "                \"value\": [\n" +
                "                  \"Blue Hydrophilic Aluminium Fin\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Air Flow & Filter Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Auto Air Swing\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Other Air Flow Features\",\n" +
                "                \"value\": [\n" +
                "                  \"Air Flow Volume (Indoor): 850 CMH, Air Vent Cross Flow\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Anti-bacteria Filter\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Dust Filter\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Other Filter Features\",\n" +
                "                \"value\": [\n" +
                "                  \"Silver Nano Filter\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Convenience Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Auto Restart\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Sleep Mode\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Self Diagnosis\",\n" +
                "                \"value\": [\n" +
                "                  \"Yes\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Additional Features\",\n" +
                "                \"value\": [\n" +
                "                  \"Indoor Noise Level (Medium): 40 dB\",\n" +
                "                  \"Connecting Pipe Type: Cu-Cu (1/2 inch and 1/4 inch)\",\n" +
                "                  \"Connecting Pipe Length: 3.5 m\",\n" +
                "                  \"Connecting Cable: 3.5 m\",\n" +
                "                  \"Inner Grooved Copper Tubes\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Power Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Power Requirement\",\n" +
                "                \"value\": [\n" +
                "                  \"AC 230 V, 50 Hz\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Power Consumption\",\n" +
                "                \"value\": [\n" +
                "                  \"1539 W\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Operating Current\",\n" +
                "                \"value\": [\n" +
                "                  \"6.8 A\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Remote Control Features\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Other Remote Control Features\",\n" +
                "                \"value\": [\n" +
                "                  \"LCD Remote\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Services\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Installation Details\",\n" +
                "                \"value\": [\n" +
                "                  \"Flipkart will facilitate Installation & Demo at time of your convenience from an brand authorized service engineer\",\n" +
                "                  \"Flipkart will communicate the day and time slot of the scheduled Installation & Demo through a SMS and the same information will also be available in your order details page\",\n" +
                "                  \"The Installation of Air-conditioner is charged extra to customer at the time of installation and needs to be paid directly to the service engineer. Standard installation charges for split AC will be Rs. 1599 (inclusive of taxes). Please check the offer details to find out whether free installation offer or any other special offer price is available at the time of purchase or not\",\n" +
                "                  \"Standard Installation of Air-conditioners covers only\",\n" +
                "                  \"a. Copper Pipe with Sleeve - 3Mtr, b. POWER CABLE 3 Core - 3Mtr, c. ODU Stand Bush s - 4Nos (Excluding Stand), d. Remote - 1Nos, e. Remote Batteries and Holding Cap, f. VINYL TAPE-ROLL - 50MM 10Mtr\",\n" +
                "                  \"Not covered as part of standard Installation charges are\",\n" +
                "                  \"a. Out Door Unit Stand - Rs. 750, b. Extra copper pipes Rs 750 per meter without sleeves & power cable, c. Drain Pipe extension if any. (per meter cost) - Rs. 125, d. Wiring extension from Meter to site, (per meter cost) Rs. 86, e. Stabilizer required for the installation if available with the technician will be chargeable extra, f. Plumbing and Masonry Work, g. Power-point/MCB fitting and any other electrical work, h. Carpentry work, i. Dismantling/Shifting of Old AC's Masonry, j. Core Cutting Fabrication and Electrical\",\n" +
                "                  \"The authorized service engineer will be providing detailed demo that includes\",\n" +
                "                  \"a. Usage of the product, b. Explain all the functionality of the product, c. Preventive maintenance action to be taken\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Technician Visit Details\",\n" +
                "                \"value\": [\n" +
                "                  \"Authorized Service Engineer will do the following\",\n" +
                "                  \"Repair / change the defective part\",\n" +
                "                  \"Provide replacement to the customer in case part/product not repairable (only after replacement request approved)\",\n" +
                "                  \"Repair Services\"\n" +
                "                ]\n" +
                "              },\n" +
                "              {\n" +
                "                \"key\": \"Uninstallation Details\",\n" +
                "                \"value\": [\n" +
                "                  \"In case of Returns Flipkart's team will visit the customers location\",\n" +
                "                  \"Uninstall\",\n" +
                "                  \"Pack\",\n" +
                "                  \"Pick-up the product\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"key\": \"Warranty\",\n" +
                "            \"values\": [\n" +
                "              {\n" +
                "                \"key\": \"Warranty Summary\",\n" +
                "                \"value\": [\n" +
                "                  \"1 Year on product and 4 Years on compressor\"\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"booksInfo\": {\n" +
                "          \"language\": null,\n" +
                "          \"binding\": null,\n" +
                "          \"pages\": null,\n" +
                "          \"publisher\": null,\n" +
                "          \"year\": 0,\n" +
                "          \"authors\": []\n" +
                "        },\n" +
                "        \"lifeStyleInfo\": {\n" +
                "          \"sleeve\": null,\n" +
                "          \"neck\": null,\n" +
                "          \"idealFor\": null\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        try {
            MasterExt m = mapper.readValue(json, MasterExt.class);
            prods = m.getProducts();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prods;
    }
}