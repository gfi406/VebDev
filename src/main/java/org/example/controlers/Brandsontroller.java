package org.example.controlers;

import org.example.dtos.BrandModelCountDTO;
import org.example.dtos.CarBrandDTO;
import org.example.services.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class Brandsontroller {
    @Autowired
    private CarBrandService brandService;

    @GetMapping("/brands")
    public List<CarBrandDTO> all(){
        return brandService.getAllCarBrands();
    }
    @PostMapping("/brands")
    public CarBrandDTO newBrand(@RequestBody CarBrandDTO dto){
        return brandService.createCarBrand(dto);
    }
    @GetMapping("/brands/{id}")
    public CarBrandDTO one(@PathVariable UUID id ){
        return brandService.getCarBrandById(id);
    }
    @GetMapping("/brands/count")
    public List<BrandModelCountDTO> allCount(){
        return brandService.getBrandModelCounts();
    }

    @DeleteMapping("/brands/{id}")
    public void del(@PathVariable UUID id ){
        brandService.deleteCarBrand(id);
    }



}
