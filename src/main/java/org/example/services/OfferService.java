package org.example.services;

import org.example.dtos.OfferDTO;
import org.example.dtos.OfferDetailsDTO;
import org.example.models.entities.Offer;

import java.util.List;
import java.util.UUID;

public interface OfferService {
    OfferDTO createOffer(OfferDTO offerDTO);
    OfferDTO getOfferById(UUID id);
    List<OfferDTO> getAllOffers();
    void deleteOffer(UUID id);

    List<OfferDetailsDTO> getOfferDetails();

    List<OfferDTO> getOfferByBrandName(String brandName);

    List<OfferDTO> getOfferByModelStartYearGreaterThane(int startYear);
}


