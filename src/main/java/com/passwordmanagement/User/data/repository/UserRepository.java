package com.passwordmanagement.User.data.repository;

import com.passwordmanagement.User.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
}
