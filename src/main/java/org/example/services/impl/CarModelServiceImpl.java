package org.example.services.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.example.dtos.CarBrandDTO;
import org.example.dtos.CarModelDTO;
import org.example.models.entities.CarBrand;
import org.example.models.entities.CarModel;
import org.example.repositories.CarBrandRepository;
import org.example.repositories.CarModelRepository;
import org.example.services.CarModelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CarModelServiceImpl implements CarModelService {
    private final CarBrandRepository carBrandRepository;
    private final CarModelRepository carModelRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CarModelServiceImpl(CarBrandRepository carBrandRepository, CarModelRepository carModelRepository, ModelMapper modelMapper) {
        this.carBrandRepository = carBrandRepository;
        this.carModelRepository = carModelRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public CarModelDTO createCarModel(CarModelDTO carModelDTO) {
        CarBrandDTO brandDTO = carModelDTO.getBrand();

        CarBrand brand = carBrandRepository.findById(brandDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("CarBrand not found: " + brandDTO.getId()));

        CarModel carModel = modelMapper.map(carModelDTO, CarModel.class);
        carModel.setBrand(brand);

        CarModel savedCarModel = carModelRepository.save(carModel);
        return modelMapper.map(savedCarModel, CarModelDTO.class);
    }

    @Override
    public CarModelDTO getCarModelById(UUID id) {
        CarModel carModel = carModelRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Car model not found: " + id));
        return modelMapper.map(carModel, CarModelDTO.class);
    }

    @Override
    public List<CarModelDTO> getAllCarModels() {
        List<CarModel> carModels = carModelRepository.findAll();
        return carModels.stream()
                .map(carModel -> modelMapper.map(carModel, CarModelDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteCarModel(UUID id) {
        carModelRepository.deleteById(id);
    }

}

