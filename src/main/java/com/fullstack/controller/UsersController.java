package com.fullstack.controller;


import com.fullstack.api.UsersApi;
import com.fullstack.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController implements UsersApi {

    @Override
    public ResponseEntity<User> getUserById(Integer eventId) {
        User user = new User();
        user.setId(1);
        user.setName("John");

        return ResponseEntity.ok(user);
    }
}
