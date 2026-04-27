package com.example.journalApplication.Repository;

import com.example.journalApplication.Entity.User;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepo extends MongoRepository<User,String> {

    User findByUsername(@NonNull String username);
}
