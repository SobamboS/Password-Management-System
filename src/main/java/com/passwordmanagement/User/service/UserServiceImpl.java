package com.passwordmanagement.User.service;

import com.passwordmanagement.User.data.model.User;
import com.passwordmanagement.User.dto.request.CreateUserRequest;
import com.passwordmanagement.User.dto.request.DeleteUserRequest;
import com.passwordmanagement.User.dto.request.LoginUserRequest;
import com.passwordmanagement.User.dto.request.UpdateUserRequest;
import com.passwordmanagement.User.dto.response.CreateUserResponse;
import com.passwordmanagement.User.dto.response.DeleteUserResponse;
import com.passwordmanagement.User.dto.response.UpdateUserResponse;
import com.passwordmanagement.User.dto.response.UserLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{
    @Autowired
    UserService userService;
    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest){
        User user = new User();
        user.setEmail("Sobambo@");
        return new CreateUserResponse("Valid");
    }

    @Override
    public UserLoginResponse loginUser(LoginUserRequest loginUserRequest){
        return null;
    }

    @Override
    public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest){
        return null;
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest){
        return null;
    }
}
