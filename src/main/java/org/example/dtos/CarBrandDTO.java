package org.example.dtos;

import java.util.UUID;

public class CarBrandDTO {
    private UUID id;
    private String name;

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

    public CarBrandDTO(String name) {
        this.name = name;
    }

    public CarBrandDTO() {
    }
}

