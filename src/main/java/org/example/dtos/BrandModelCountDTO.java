package org.example.dtos;

import java.util.UUID;

public class BrandModelCountDTO {
    private UUID id;
    private String name;
    private Long modelCount;

    public BrandModelCountDTO(UUID id, String name, Long modelCount) {
        this.id = id;
        this.name = name;
        this.modelCount = modelCount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getModelCount() {
        return modelCount;
    }
}
