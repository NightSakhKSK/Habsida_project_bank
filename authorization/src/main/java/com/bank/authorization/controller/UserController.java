package com.bank.authorization.controller;

import com.bank.authorization.DTO.UserDTO;
import com.bank.authorization.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Tag(name = "Пользователи", description = "Операции, связанные с пользователями")
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("Создание нового пользователя")
    @PostMapping
    public UserDTO createUser(@Parameter(description = "DTO с данными пользователя") @RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }

    @Operation(summary = "Обновление данных пользователя")
    @PutMapping("/{id}")
    public UserDTO updateUser(@Parameter(description = "Идентификатор пользователя") @PathVariable Long id,
                              @Parameter(description = "DTO с данными пользователя") @RequestBody UserDTO userDTO) {
        return userService.updateUser(id, userDTO);
    }

    @Operation(summary = "Удаление пользователя")
    @DeleteMapping("/{id}")
    public void deleteUser(@Parameter(description = "Идентификатор пользователя") @PathVariable Long id) {
        userService.delete(id);
    }

    @Operation(summary = "Получение списка всех пользователей")
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.findAll();
    }

    @Operation(summary = "Получение пользователя по идентификатору")
    @GetMapping("/{id}")
    public UserDTO getUserById(@Parameter(description = "Идентификатор пользователя") @PathVariable Long id) {
        return userService.findById(id);
    }

    @Operation(summary = "Получение пользователя по идентификатору профиля")
    @GetMapping("/profile/{profileId}")
    public UserDTO getUserByProfileId(@Parameter(description = "Идентификатор профиля") @PathVariable Long profileId) {
        return userService.findByProfileId(profileId);
    }
}
