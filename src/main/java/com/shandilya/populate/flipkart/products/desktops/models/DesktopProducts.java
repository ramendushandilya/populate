package com.shandilya.populate.flipkart.products.desktops.models;

import com.shandilya.populate.flipkart.products.common.pojo.BaseInfo;

import javax.persistence.*;

/**
 * @author rams0516
 *         Date: 4/30/2018
 *         Time: 5:11 PM
 */
@Entity
public class DesktopProducts {

    public DesktopProducts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private BaseInfo baseInfo;

    public DesktopProducts(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Long getId() {
        return id;
    }

    public DesktopProducts setId(Long id) {
        this.id = id;
        return this;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public DesktopProducts setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    @Override
    public String toString() {
        return "DesktopProducts{" +
                "id=" + id +
                ", baseInfo=" + baseInfo +
                '}';
    }
}