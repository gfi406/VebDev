package org.example.services;

import org.example.dtos.UserDTO;
import org.example.models.entities.User;
import org.example.models.enums.UserRoleType;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(UUID userId);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(UUID userId, UserDTO userDTO);
    void deleteUser(UUID userId);

    List<UserDTO> findUsersByRole(UserRoleType roleType);
}


