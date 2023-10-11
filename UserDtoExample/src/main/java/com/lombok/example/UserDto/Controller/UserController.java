package com.lombok.example.UserDto.Controller;

import com.lombok.example.UserDto.*;
import com.lombok.example.UserDto.Service.*;
import com.lombok.example.UserDto.Service.impl.UserServiceImpl;
import com.lombok.example.UserDto.CustomClass.DtoCustomClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public DtoCustomClass getUser(@PathVariable long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping
    public List<DtoCustomClass> getAllUsers() {
        // Add logic to retrieve a list of all users
        return userService.getAllUsers();
    }

    @PostMapping
    public DtoCustomClass createUser(@RequestBody DtoCustomClass userDTO) {
        // Add logic to create a new user and return the created user
        return userService.createUser(userDTO);
    }
}
