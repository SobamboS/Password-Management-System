package com.passwordmanagement.User.controller;

import com.passwordmanagement.User.dto.request.CreateUserRequest;
import com.passwordmanagement.User.dto.response.CreateUserResponse;
import com.passwordmanagement.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class UserController{
    @Autowired
    private UserService userService;

    @PostMapping("/create_user")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest){
        return userService.createUser(createUserRequest);
    }
}
