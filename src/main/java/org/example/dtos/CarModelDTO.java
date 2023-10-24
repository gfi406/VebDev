package org.example.dtos;

import jakarta.persistence.*;
import org.example.models.entities.CarBrand;
import org.example.models.enums.ModelCategory;

import java.util.UUID;

public class CarModelDTO {
    private UUID id;
    private String name;
    private ModelCategory category;
    private String imageUrl;
    private Integer startYear;
    private Integer endYear;
    private CarBrandDTO brand;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarBrandDTO getBrand() {
        return brand;
    }

    public void setBrand(CarBrandDTO brand) {
        this.brand = brand;
    }

    public CarModelDTO(String name, ModelCategory category, String imageUrl, Integer startYear, Integer endYear, CarBrandDTO brand) {
        this.name = name;
        this.category = category;
        this.imageUrl = imageUrl;
        this.startYear = startYear;
        this.endYear = endYear;
        this.brand = brand;
    }

    public CarModelDTO() {
    }
}

