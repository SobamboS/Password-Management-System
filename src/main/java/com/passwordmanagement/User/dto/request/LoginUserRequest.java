package com.passwordmanagement.User.dto.request;

import lombok.Data;

@Data
public class LoginUserRequest{
    private String email;
    private String password;
}
