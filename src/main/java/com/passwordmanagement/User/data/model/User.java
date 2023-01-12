package com.passwordmanagement.User.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User{
    @Id
    private String userId;
    private String email;
    private String password;
}
