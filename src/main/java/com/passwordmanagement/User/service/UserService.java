package com.passwordmanagement.User.service;

import com.passwordmanagement.User.dto.request.CreateUserRequest;
import com.passwordmanagement.User.dto.request.LoginUserRequest;
import com.passwordmanagement.User.dto.response.CreateUserResponse;
import com.passwordmanagement.User.dto.response.UserLoginResponse;

public interface UserService{

CreateUserResponse createUser(CreateUserRequest createUserRequest);
UserLoginResponse loginUser (LoginUserRequest loginUserRequest);
}
