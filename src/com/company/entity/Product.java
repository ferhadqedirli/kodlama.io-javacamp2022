package com.company.entity;

public class Product {
    private String name;
    private Double unitPrice;
    private Double discountRate;
    private String imageUrl;
    private Integer unitsInStock;

    public Product() {
    }

    public Product(String name, Double unitPrice, Double discountRate, String imageUrl, Integer unitsInStock) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.imageUrl = imageUrl;
        this.unitsInStock = unitsInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", discountRate=" + discountRate +
                ", imageUrl='" + imageUrl + '\'' +
                ", unitsInStock=" + unitsInStock +
                '}';
    }
}
