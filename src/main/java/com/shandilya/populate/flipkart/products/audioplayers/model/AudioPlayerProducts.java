package com.shandilya.populate.flipkart.products.audioplayers.model;

import javax.persistence.*;

@Entity
public class AudioPlayerProducts {

    public AudioPlayerProducts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private AudioPlayerProductBaseInfo baseInfo;

    @Embedded
    private AudioPlayerCategorySpecificInfo categorySpecificInfo;

    public AudioPlayerProducts(AudioPlayerProductBaseInfo baseInfo, AudioPlayerCategorySpecificInfo categorySpecificInfo) {
        this.baseInfo = baseInfo;
        this.categorySpecificInfo = categorySpecificInfo;
    }

    public AudioPlayerProductBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(AudioPlayerProductBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public AudioPlayerCategorySpecificInfo getCategorySpecificInfo() {
        return categorySpecificInfo;
    }

    public void setCategorySpecificInfo(AudioPlayerCategorySpecificInfo categorySpecificInfo) {
        this.categorySpecificInfo = categorySpecificInfo;
    }

    @Override
    public String toString() {
        return "AudioPlayerProducts{" +
                "baseInfo=" + baseInfo +
                ", categorySpecificInfo=" + categorySpecificInfo +
                '}';
    }
}
