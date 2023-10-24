package org.example.dtos;

import java.math.BigDecimal;

public class OfferDetailsDTO {
    private String description;
    private BigDecimal price;
    private Integer year;
    private String brandName;
    private String modelName;

    public OfferDetailsDTO(String description, BigDecimal price, Integer year, String brandName, String modelName) {
        this.description = description;
        this.price = price;
        this.year = year;
        this.brandName = brandName;
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
