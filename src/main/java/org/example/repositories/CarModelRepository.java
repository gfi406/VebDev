package org.example.repositories;


import org.example.models.entities.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CarModelRepository extends JpaRepository<CarModel, UUID> {
}
