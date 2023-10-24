package org.example.models.entities;

import jakarta.persistence.*;
import org.example.models.baseEntities.TimestampedEntity;
import org.example.models.enums.ModelCategory;

@Entity
@Table(name = "models")

public class CarModel extends TimestampedEntity {

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "category", length = 9, nullable = false)
    private ModelCategory category;

    @Column(name = "imageUrl", length = 512, nullable = false)
    private String imageUrl;

    @Column(name = "startYear", length = 9, nullable = false)
    private Integer startYear;

    @Column(name = "endYear", length = 9, nullable = false)
    private Integer endYear;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private CarBrand brand;

    public CarModel(String name, ModelCategory category, String imageUrl, Integer startYear, Integer endYear, CarBrand brand) {
        this.name = name;
        this.category = category;
        this.imageUrl = imageUrl;
        this.startYear = startYear;
        this.endYear = endYear;
        this.brand = brand;
    }

    public CarModel() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(ModelCategory category) {
        this.category = category;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public ModelCategory getCategory() {
        return category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public CarBrand getBrand() {
        return brand;
    }
}
