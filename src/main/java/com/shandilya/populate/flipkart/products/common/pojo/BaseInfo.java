package com.shandilya.populate.flipkart.products.common.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:10 PM
 */
@Embeddable
public class BaseInfo {

    public BaseInfo() {
    }

    private String productId;
    private String ProductTitle;
    private ImageUrls imageUrls;
    private String flipkartSellingPrice;
    @Column(length = 1000000)
    private String productUrl;
    private String brand;
    private String inStock;
    private String codAvailable;
    private String offers;
    private String categoryPath;
    private Attributes attributes;

    public BaseInfo(String productId, String productTitle, ImageUrls imageUrls, String flipkartSellingPrice,
                    String productUrl, String brand, String inStock, String codAvailable, String offers,
                    String categoryPath, Attributes attributes) {
        this.productId = productId;
        ProductTitle = productTitle;
        this.imageUrls = imageUrls;
        this.flipkartSellingPrice = flipkartSellingPrice;
        this.productUrl = productUrl;
        this.brand = brand;
        this.inStock = inStock;
        this.codAvailable = codAvailable;
        this.offers = offers;
        this.categoryPath = categoryPath;
        this.attributes = attributes;
    }

    public String getProductId() {
        return productId;
    }

    public BaseInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }

    public String getProductTitle() {
        return ProductTitle;
    }

    public BaseInfo setProductTitle(String productTitle) {
        ProductTitle = productTitle;
        return this;
    }

    public ImageUrls getImageUrls() {
        return imageUrls;
    }

    public BaseInfo setImageUrls(ImageUrls imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }

    public String getFlipkartSellingPrice() {
        return flipkartSellingPrice;
    }

    public BaseInfo setFlipkartSellingPrice(String flipkartSellingPrice) {
        this.flipkartSellingPrice = flipkartSellingPrice;
        return this;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public BaseInfo setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public BaseInfo setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String isInStock() {
        return inStock;
    }

    public BaseInfo setInStock(String inStock) {
        this.inStock = inStock;
        return this;
    }

    public String isCodAvailable() {
        return codAvailable;
    }

    public BaseInfo setCodAvailable(String codAvailable) {
        this.codAvailable = codAvailable;
        return this;
    }

    public String getOffers() {
        return offers;
    }

    public BaseInfo setOffers(String offers) {
        this.offers = offers;
        return this;
    }

    public String getCategoryPath() {
        return categoryPath;
    }

    public BaseInfo setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
        return this;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public BaseInfo setAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "productId='" + productId + '\'' +
                ", ProductTitle='" + ProductTitle + '\'' +
                ", imageUrls=" + imageUrls +
                ", flipkartSellingPrice='" + flipkartSellingPrice + '\'' +
                ", productUrl='" + productUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", inStock='" + inStock + '\'' +
                ", codAvailable='" + codAvailable + '\'' +
                ", offers='" + offers + '\'' +
                ", categoryPath='" + categoryPath + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}