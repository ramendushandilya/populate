package com.shandilya.populate.flipkart.external.domains.airconditioner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attributes {

    @JsonProperty("size")
    private String size;

    @JsonProperty("color")
    private String color;

    @JsonProperty("storage")
    private String storage;

    @JsonProperty("sizeUnit")
    private String sizeUnit;

    @JsonProperty("displaySize")
    private String displaySize;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", storage='" + storage + '\'' +
                ", sizeUnit='" + sizeUnit + '\'' +
                ", displaySize='" + displaySize + '\'' +
                '}';
    }
}
