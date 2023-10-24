package org.example.services;

import jakarta.transaction.Transactional;
import org.example.dtos.BrandModelCountDTO;
import org.example.dtos.CarBrandDTO;

import java.util.List;
import java.util.UUID;

public interface CarBrandService {
    CarBrandDTO createCarBrand(CarBrandDTO carBrandDTO);
    CarBrandDTO getCarBrandById(UUID id);
    List<CarBrandDTO> getAllCarBrands();
    void deleteCarBrand(UUID id);

    @Transactional
    List<BrandModelCountDTO> getBrandModelCounts();
}


