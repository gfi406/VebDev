package org.example.dtos;

import org.example.models.enums.UserRoleType;

import java.util.UUID;

public class UserRoleDTO {
    private UUID id;
    private UserRoleType role;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setRole(UserRoleType role) {
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public UserRoleType getRole() {
        return role;
    }

    public UserRoleDTO() {
    }

    public UserRoleDTO(UserRoleType role) {
        this.role = role;
    }
}
