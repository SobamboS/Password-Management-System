package com.passwordmanagement.User.controller;

import com.mongodb.internal.bulk.DeleteRequest;
import com.passwordmanagement.User.dto.request.CreateUserRequest;
import com.passwordmanagement.User.dto.request.LoginUserRequest;
import com.passwordmanagement.User.dto.request.UpdateUserRequest;
import com.passwordmanagement.User.dto.response.CreateUserResponse;
import com.passwordmanagement.User.dto.response.DeleteUserResponse;
import com.passwordmanagement.User.dto.response.UpdateUserResponse;
import com.passwordmanagement.User.dto.response.UserLoginResponse;
import com.passwordmanagement.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
public class UserController{
    @Autowired
    private UserService userService;

    @PostMapping("/create_user")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest){
        return userService.createUser(createUserRequest);
    }

    @GetMapping("/login_user")
    public UserLoginResponse loginUser(@RequestBody LoginUserRequest loginUserRequest){
        return userService.loginUser(loginUserRequest);
    }

    @PutMapping("/update_user")
    public UpdateUserResponse updateUser(@RequestBody UpdateUserRequest updateUserRequest){
        return userService.updateUser(updateUserRequest);
    }

    @DeleteMapping("/delete_user")
    public DeleteUserResponse deleteUser(@RequestBody String id){
        return userService.deleteUser("id");
    }
}
