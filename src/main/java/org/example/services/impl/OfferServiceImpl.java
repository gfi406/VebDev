package org.example.services.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.example.dtos.*;
import org.example.models.entities.CarModel;
import org.example.models.entities.Offer;
import org.example.models.entities.User;
import org.example.repositories.CarModelRepository;
import org.example.repositories.OfferRepository;
import org.example.repositories.UserRepository;
import org.example.services.OfferService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OfferServiceImpl implements OfferService {
    private final CarModelRepository carModelRepository;
    private final UserRepository userRepository;
    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public OfferServiceImpl(CarModelRepository carModelRepository, UserRepository userRepository, OfferRepository offerRepository, ModelMapper modelMapper) {
        this.carModelRepository = carModelRepository;
        this.userRepository = userRepository;
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public OfferDTO createOffer(OfferDTO offerDTO) {

        CarModelDTO modelDTO = offerDTO.getModel();

        UserDTO sellerDTO = offerDTO.getSeller();

        CarModel model = carModelRepository.findById(modelDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("CarModel not found: " + modelDTO.getId()));

        User seller = userRepository.findById(sellerDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("User not found: " + sellerDTO.getId()));

        Offer offer = modelMapper.map(offerDTO, Offer.class);
        offer.setModel(model);
        offer.setSeller(seller);

        Offer savedOffer = offerRepository.save(offer);
        return modelMapper.map(savedOffer, OfferDTO.class);
    }


    @Override
    public OfferDTO getOfferById(UUID id) {
        Offer offer = offerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Offer not found with id: " + id));
        return modelMapper.map(offer, OfferDTO.class);
    }

    @Override
    public List<OfferDTO> getAllOffers() {
        List<Offer> offers = offerRepository.findAll();
        return offers.stream()
                .map(offer -> modelMapper.map(offer, OfferDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteOffer(UUID id) {
        offerRepository.deleteById(id);
    }

    @Override
    public List<OfferDetailsDTO> getOfferDetails() {
        return offerRepository.getOfferDetails();
    }

    @Override
    public List<OfferDTO> getOfferByBrandName(String brandName) {
        List<Offer> offers = offerRepository.findByModel_Brand_Name(brandName);
        List<OfferDTO> offerDTOs = offers.stream()
                .map(offer -> modelMapper.map(offer, OfferDTO.class))
                .collect(Collectors.toList());
        return offerDTOs;
    }

    @Override
    public List<OfferDTO> getOfferByModelStartYearGreaterThane(int startYear) {
        List<Offer> offers = offerRepository.findByModel_StartYearGreaterThan(startYear);
        List<OfferDTO> offerDTOs = offers.stream()
                .map(offer -> modelMapper.map(offer, OfferDTO.class))
                .collect(Collectors.toList());
        return offerDTOs;
    }
}

