package org.example.repositories;

import org.example.dtos.OfferDetailsDTO;
import org.example.models.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OfferRepository extends JpaRepository<Offer, UUID> {
    @Query("SELECT new org.example.dtos.OfferDetailsDTO(o.description, o.price, o.year, o.model.brand.name, o.model.name) FROM Offer o")
    List<OfferDetailsDTO> getOfferDetails();

    List<Offer> findByModel_Brand_Name(String brandName);

    List<Offer> findByModel_StartYearGreaterThan(int startYear);

}
