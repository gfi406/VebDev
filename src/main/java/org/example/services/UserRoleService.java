package org.example.services;

import org.example.dtos.UserRoleDTO;

import java.util.List;
import java.util.UUID;

public interface UserRoleService {
    UserRoleDTO createUserRole(UserRoleDTO userRoleDTO);

    UserRoleDTO getUserRoleById(UUID id);;

    List<UserRoleDTO> getAllUserRoles();

    void deleteUserRole(UUID id);
}

