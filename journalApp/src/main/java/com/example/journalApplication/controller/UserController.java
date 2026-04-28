package com.example.journalApplication.controller;

import com.example.journalApplication.Entity.User;
import com.example.journalApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping
    public List<User> getAll() {
        return userservice.getAll();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userservice.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping("{username}")
    public ResponseEntity<?> updateUser(@RequestBody User userEntry,@PathVariable String username) {

        User userInDB = userservice.findByUserName(username);

        if (userInDB != null) {
            userInDB.setPassword(userEntry.getPassword());
            userInDB.setUsername(userEntry.getUsername());
            userservice.saveUser(userInDB);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }
}