package com.fullstack.service;

import com.fullstack.model.User;
import com.fullstack.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(String username, String hashedPassword) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setUsername(username);
        user.setHashedPassword(hashedPassword);
        return userRepository.save(user);
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
