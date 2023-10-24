package org.example.services.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.example.dtos.UserRoleDTO;
import org.example.models.entities.UserRole;
import org.example.repositories.UserRoleRepository;
import org.example.services.UserRoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepository userRoleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository, ModelMapper modelMapper) {
        this.userRoleRepository = userRoleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public UserRoleDTO createUserRole(UserRoleDTO userRoleDTO) {
        UserRole userRole = modelMapper.map(userRoleDTO, UserRole.class);
        UserRole savedUserRole = userRoleRepository.save(userRole);
        return modelMapper.map(savedUserRole, UserRoleDTO.class);
    }

    @Override
    public UserRoleDTO getUserRoleById(UUID id) {
        Optional<UserRole> userRoleOptional = userRoleRepository.findById(id);

        if (userRoleOptional.isPresent()) {
            return modelMapper.map(userRoleOptional.get(), UserRoleDTO.class);
        } else {
            throw new EntityNotFoundException("User role not found with id: " + id);
        }
    }

    @Override
    public List<UserRoleDTO> getAllUserRoles() {
        List<UserRole> userRoles = userRoleRepository.findAll();
        return userRoles.stream()
                .map(userRole -> modelMapper.map(userRole, UserRoleDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteUserRole(UUID id) {
        userRoleRepository.deleteById(id);
    }
}

