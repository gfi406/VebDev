package org.example.controlers;

import org.example.dtos.UserDTO;
import org.example.models.enums.UserRoleType;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class Usersontroller {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserDTO getById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public UserDTO create(@RequestBody UserDTO dto) {
        return userService.createUser(dto);
    }

    @PutMapping("/users/{id}")
    public UserDTO update(@PathVariable UUID id, @RequestBody UserDTO dto) {
        return userService.updateUser(id, dto);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable UUID id) {
        userService.deleteUser(id);
    }


    @GetMapping("/users/roles/{role}")
    public List<UserDTO> getByRole(@PathVariable UserRoleType role) {
        return userService.findUsersByRole(role);
    }


}
