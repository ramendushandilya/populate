package com.shandilya.populate.flipkart.products.audioplayers.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Arrays;

@Embeddable
public class AudioPlayerCategorySpecificInfo {

    public AudioPlayerCategorySpecificInfo() {
    }

    @Column(length=1000)
    private String[] detailedSpecs;

    public AudioPlayerCategorySpecificInfo(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    public String[] getDetailedSpecs() {
        return detailedSpecs;
    }

    public void setDetailedSpecs(String[] detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    @Override
    public String toString() {
        return "AudioPlayerCategorySpecificInfo{" +
                "detailedSpecs=" + Arrays.toString(detailedSpecs) +
                '}';
    }
}
