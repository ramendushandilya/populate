package com.shandilya.populate.flipkart.products.audioplayers.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Arrays;

@Embeddable
public class AudioPlayerProductBaseInfo {

    public AudioPlayerProductBaseInfo() {
    }

    private String productId;
    private String title;
    @Embedded
    private AudioPlayerImageUrls imageUrls;
    private String price;

    @Column(length = 3000)
    private String productUrl;
    private String brand;
    private String inStock;
    @Column(length=1000)
    private String[] offers;

    public AudioPlayerProductBaseInfo(String productId, String title, AudioPlayerImageUrls imageUrls,
                             String price, String productUrl, String brand, String inStock,
                             String[] offers) {
        this.productId = productId;
        this.title = title;
        this.imageUrls = imageUrls;
        this.price = price;
        this.productUrl = productUrl;
        this.brand = brand;
        this.inStock = inStock;
        this.offers = offers;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AudioPlayerImageUrls getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(AudioPlayerImageUrls imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public String[] getOffers() {
        return offers;
    }

    public void setOffers(String[] offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return "AudioPlayerProductBaseInfo{" +
                "productId='" + productId + '\'' +
                ", title='" + title + '\'' +
                ", imageUrls=" + imageUrls +
                ", price=" + price +
                ", productUrl='" + productUrl + '\'' +
                ", brand='" + brand + '\'' +
                ", inStock='" + inStock + '\'' +
                ", offers=" + Arrays.toString(offers) +
                '}';
    }
}
