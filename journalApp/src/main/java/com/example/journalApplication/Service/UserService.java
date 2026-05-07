package com.example.journalApplication.Service;



import com.example.journalApplication.Entity.User;
import com.example.journalApplication.Repository.UserRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepos;

    public void saveUser(User entry) {

        userRepos.save(entry);
    }


    public List<User> getAll(){

        return userRepos.findAll();
    }

    public User getAllByName(String name){

        return userRepos.findByUsername(name);
    }

    public User findByUserName(String username) {

        if (username == null) {
            throw new IllegalArgumentException("Username cannot be null");
        }

        return userRepos.findByUsername(username);
    }

    public boolean deleteById(String id) {
        if (userRepos.existsById(id)) {
            userRepos.deleteById(id);
            return true;
        }
        return false;
    }
}
;