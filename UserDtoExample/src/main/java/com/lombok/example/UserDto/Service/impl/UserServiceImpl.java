package com.lombok.example.UserDto.Service.impl;

import com.lombok.example.UserDto.CustomClass.DtoCustomClass;
import com.lombok.example.UserDto.Service.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    public DtoCustomClass getUserById(long userId) {
        // Simulate fetching user data from a database
        DtoCustomClass user = new DtoCustomClass();
        user.setUsername("Vaishnavi");
        user.setEmail("vaishnavi.m@example.com");
        return user;
    }

	public List<DtoCustomClass> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public DtoCustomClass createUser(DtoCustomClass userDTO) {
		// TODO Auto-generated method stub
		return null;
	}
}
