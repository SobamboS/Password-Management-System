package com.passwordmanagement.User.service;

import com.passwordmanagement.User.data.model.User;
import com.passwordmanagement.User.data.repository.UserRepository;
import com.passwordmanagement.User.dto.request.CreateUserRequest;

import com.passwordmanagement.User.dto.request.LoginUserRequest;
import com.passwordmanagement.User.dto.request.UpdateUserRequest;
import com.passwordmanagement.User.dto.response.CreateUserResponse;
import com.passwordmanagement.User.dto.response.DeleteUserResponse;
import com.passwordmanagement.User.dto.response.UpdateUserResponse;
import com.passwordmanagement.User.dto.response.UserLoginResponse;
import com.passwordmanagement.User.exception.CreateUserException;
import com.passwordmanagement.User.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest){
        User user=new User();
        user.setEmail(createUserRequest.getEmail());
        user.setPassword(createUserRequest.getPassword());
        if(!UserValidator.isValidEmail(createUserRequest.getEmail())) throw new CreateUserException(String.format("%s is invalid",createUserRequest.getEmail()));
        if(!UserValidator.isValidPassword(createUserRequest.getPassword())) throw  new CreateUserException((String.format("%s is not strong enough",createUserRequest.getPassword())));
        userRepository.save(user);
        return new CreateUserResponse("Registration Successful");
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
    public DeleteUserResponse deleteUser(String id){
        return null;
    }
}
