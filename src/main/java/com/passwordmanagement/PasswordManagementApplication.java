package com.passwordmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PasswordManagementApplication{

    public static void main(String[] args){
        SpringApplication.run(PasswordManagementApplication.class,args);
    }

}
