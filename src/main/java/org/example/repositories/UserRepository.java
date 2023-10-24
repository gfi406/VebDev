package org.example.repositories;

import org.example.models.entities.User;
import org.example.models.entities.UserRole;
import org.example.models.enums.UserRoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    @Query("SELECT u FROM User u LEFT JOIN FETCH u.role WHERE u.id = :userId")
    Optional <User> findUserWithRoleById(@Param("userId") UUID userId);

    List<User> findByRole_Role(UserRoleType roleType);
}
