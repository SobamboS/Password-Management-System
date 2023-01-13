package com.passwordmanagement.User.service;

import com.passwordmanagement.User.dto.request.CreateUserRequest;

import com.passwordmanagement.User.dto.request.LoginUserRequest;
import com.passwordmanagement.User.dto.request.UpdateUserRequest;
import com.passwordmanagement.User.dto.response.CreateUserResponse;
import com.passwordmanagement.User.dto.response.DeleteUserResponse;
import com.passwordmanagement.User.dto.response.UpdateUserResponse;
import com.passwordmanagement.User.dto.response.UserLoginResponse;



public interface UserService{

CreateUserResponse createUser(CreateUserRequest createUserRequest);
UserLoginResponse loginUser (LoginUserRequest loginUserRequest);

UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest);

DeleteUserResponse deleteUser(String id);


}
