package com.passwordmanagement.User.dto.request;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CreateUserRequest{
    private String email;

@Pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*_?&])[A-Za-z\\d@$!%*_?&]{8,20}$")
    private String password;
}
