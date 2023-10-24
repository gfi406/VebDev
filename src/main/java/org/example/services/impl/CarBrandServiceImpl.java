package org.example.services.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.example.dtos.BrandModelCountDTO;
import org.example.dtos.CarBrandDTO;
import org.example.models.entities.CarBrand;
import org.example.repositories.CarBrandRepository;
import org.example.services.CarBrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class CarBrandServiceImpl implements CarBrandService {
    private final CarBrandRepository carBrandRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CarBrandServiceImpl(CarBrandRepository carBrandRepository, ModelMapper modelMapper) {
        this.carBrandRepository = carBrandRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public CarBrandDTO createCarBrand(CarBrandDTO carBrandDTO) {
        CarBrand carBrand = modelMapper.map(carBrandDTO, CarBrand.class);
        CarBrand savedCarBrand = carBrandRepository.save(carBrand);
        return modelMapper.map(savedCarBrand, CarBrandDTO.class);
    }

    @Override
    public CarBrandDTO getCarBrandById(UUID id) {
        CarBrand carBrand = carBrandRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Car brand not found: " + id));
        return modelMapper.map(carBrand, CarBrandDTO.class);
    }

    @Override
    public List<CarBrandDTO> getAllCarBrands() {
        List<CarBrand> carBrands = carBrandRepository.findAll();
        return carBrands.stream()
                .map(carBrand -> modelMapper.map(carBrand, CarBrandDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteCarBrand(UUID id) {
        carBrandRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<BrandModelCountDTO> getBrandModelCounts() {
        List<BrandModelCountDTO> brandModelCounts = carBrandRepository.getBrandModelCounts();
        return brandModelCounts;
    }
}


