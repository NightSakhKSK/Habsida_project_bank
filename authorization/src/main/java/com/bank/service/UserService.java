package com.bank.service;

import com.bank.DTO.UserDTO;

public interface UserService {
    UserDTO findByUsername(String username);
}
