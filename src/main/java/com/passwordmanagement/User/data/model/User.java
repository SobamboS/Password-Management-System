package com.passwordmanagement.User.data.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String userId;

    @NotBlank(message="This field cannot be empty")
    @Email(message="This field requires a valid email address")
    private String email;

    private String password;
}
