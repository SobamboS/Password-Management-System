package com.passwordmanagement.User.dto.request;

import lombok.Data;

@Data
public class CreateUserRequest{
    private String email;
    private String password;
}
