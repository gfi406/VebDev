package org.example.controlers;


import org.example.dtos.OfferDTO;
import org.example.dtos.OfferDetailsDTO;
import org.example.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class Offersontroller {

    @Autowired
    private OfferService offerService;

    @GetMapping("/offers")
    public List<OfferDTO> getAll() {
        return offerService.getAllOffers();
    }

    @GetMapping("/offers/{id}")
    public OfferDTO getById(@PathVariable UUID id) {
        return offerService.getOfferById(id);
    }

    @PostMapping("/offers")
    public OfferDTO create(@RequestBody OfferDTO dto) {
        return offerService.createOffer(dto);
    }

    @DeleteMapping("/offers/{id}")
    public void delete(@PathVariable UUID id) {
        offerService.deleteOffer(id);
    }

    // дополнительные методы
    @GetMapping("/offers/details")
    public List<OfferDetailsDTO> getDetails() {
        return offerService.getOfferDetails();
    }

}
