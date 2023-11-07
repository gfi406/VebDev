package org.example.controlers;

import org.example.dtos.CarModelDTO;
import org.example.services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class Modelsontroller {
    @Autowired
    private CarModelService carModelService;

    @GetMapping("/models")
    public List<CarModelDTO> getAll() {
        return carModelService.getAllCarModels();
    }

    @GetMapping("/models/{id}")
    public CarModelDTO getById(@PathVariable UUID id) {
        return carModelService.getCarModelById(id);
    }

    @PostMapping("/models")
    public CarModelDTO create(@RequestBody CarModelDTO dto) {
        return carModelService.createCarModel(dto);
    }

    @DeleteMapping("/models/{id}")
    public void delete(@PathVariable UUID id) {
        carModelService.deleteCarModel(id);
    }

}
