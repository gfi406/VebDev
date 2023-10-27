package org.example.controlers;

import org.example.dtos.UserDTO;
import org.example.models.enums.UserRoleType;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class Usersontroller {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> all(){
        return userService.getAllUsers();
    }
    @GetMapping("/users/role/{role}")
    public List<UserDTO> findByRole_Role(@PathVariable UserRoleType role ){
        return userService.findUsersByRole(role);
    }
    @DeleteMapping("/users/{id}")
    public  void delUser(@PathVariable UUID id ){
            userService.deleteUser(id);
    }



}
