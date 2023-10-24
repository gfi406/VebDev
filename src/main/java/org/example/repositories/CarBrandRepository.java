package org.example.repositories;

import org.example.dtos.BrandModelCountDTO;
import org.example.models.entities.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarBrandRepository extends JpaRepository<CarBrand, UUID> {
    @Query("SELECT NEW org.example.dtos.BrandModelCountDTO(b.id, b.name, COUNT(m)) " +
            "FROM CarBrand b LEFT JOIN b.models m GROUP BY b.id, b.name")
    List<BrandModelCountDTO> getBrandModelCounts();
}
