package com.shandilya.populate.flipkart.products.common.pojo;

import javax.persistence.Embeddable;

/**
 * @author rams0516
 *         Date: 4/26/2018
 *         Time: 3:40 PM
 */
@Embeddable
public class Attributes {

    public Attributes() {
    }

    private String size;
    private String color;
    private String storage;
    private String sizeUnit;
    private String displaySize;

    public Attributes(String size, String color, String storage, String sizeUnit, String displaySize) {
        this.size = size;
        this.color = color;
        this.storage = storage;
        this.sizeUnit = sizeUnit;
        this.displaySize = displaySize;
    }

    public String getSize() {
        return size;
    }

    public Attributes setSize(String size) {
        this.size = size;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Attributes setColor(String color) {
        this.color = color;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public Attributes setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getSizeUnit() {
        return sizeUnit;
    }

    public Attributes setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
        return this;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public Attributes setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
        return this;
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