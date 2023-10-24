package org.example.models.entities;

import jakarta.persistence.*;
import org.example.models.baseEntities.TimestampedEntity;

import java.util.*;

@Entity
@Table(name = "brands")

public class CarBrand extends TimestampedEntity {
    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CarModel> models = new ArrayList<>();

    public CarBrand(String name) {
        this.name = name;
    }

    public CarBrand() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModels(List<CarModel> models) {
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public List<CarModel> getModels() {
        return models;
    }
}
