package org.example.services;

import org.example.dtos.CarModelDTO;

import java.util.List;
import java.util.UUID;

public interface CarModelService {
    CarModelDTO createCarModel(CarModelDTO carModelDTO);
    CarModelDTO getCarModelById(UUID id);
    List<CarModelDTO> getAllCarModels();
    void deleteCarModel(UUID id);
}


