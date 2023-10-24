package org.example.models.entities;

import jakarta.persistence.*;
import org.example.models.baseEntities.TimestampedEntity;
import org.example.models.enums.EngineType;
import org.example.models.enums.TransmissionType;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")

public class Offer extends TimestampedEntity {

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "engine", length = 9, nullable = false)
    private EngineType engine;

    @Column(name = "imageUrl", length = 512, nullable = false)
    private String imageUrl;

    @Column(name = "mileage", length = 9, nullable = false)
    private Integer mileage;

    @Column(name = "price", columnDefinition = "numeric(18,2)", nullable = false)
    private BigDecimal price;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "transmission", length = 9, nullable = false)
    private TransmissionType transmission;

    @Column(name = "year", length = 9, nullable = false)
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private CarModel model;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TransmissionType getTransmission() {
        return transmission;
    }

    public void setTransmission(TransmissionType transmission) {
        this.transmission = transmission;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Offer(String description, EngineType engine, String imageUrl, Integer mileage, BigDecimal price, TransmissionType transmission, Integer year, CarModel model, User seller) {
        this.description = description;
        this.engine = engine;
        this.imageUrl = imageUrl;
        this.mileage = mileage;
        this.price = price;
        this.transmission = transmission;
        this.year = year;
        this.model = model;
        this.seller = seller;
    }

    public Offer() {

    }
}
