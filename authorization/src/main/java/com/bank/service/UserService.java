package com.bank.service;

import com.bank.DTO.UserDTO;
import com.bank.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User findByProfileId(Long profileId);
    User save(User user);
    void deleteById(Long id);
    List<User> findAll();
}
