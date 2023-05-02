package com.bank.authorization.service;

import com.bank.authorization.DTO.UserDTO;
import com.bank.authorization.entity.User;
import com.bank.authorization.exception.UserNotFoundException;
import com.bank.authorization.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NoSuchElementException("User not found"));
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public UserDTO findByProfileId(Long profileId) {
        User user = userRepository.findByProfileId(profileId);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user = userRepository.save(user);
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDTO updateUser(Long id, UserDTO userDTO) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));

        // Обновление полей
        existingUser.setRole(userDTO.getRole());
        existingUser.setProfileId(userDTO.getProfileId());
        existingUser.setPassword(userDTO.getPassword());

        User updatedUser = userRepository.save(existingUser);

        return convertToUserDTO(updatedUser);
    }

    private UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setRole(user.getRole());
        userDTO.setProfileId(user.getProfileId());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }
}

