package com.bank.authorization.service;

import com.bank.authorization.DTO.UserDTO;
import com.bank.authorization.entity.User;

import java.util.List;

public interface UserService {
    UserDTO findById(Long id);
    UserDTO findByProfileId(Long profileId);
    List<UserDTO> findAll();
    UserDTO save(UserDTO userDTO);
    void delete(Long id);
    UserDTO updateUser(Long id, UserDTO userDTO);
}


