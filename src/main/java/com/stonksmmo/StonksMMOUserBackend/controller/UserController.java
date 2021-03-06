package com.stonksmmo.StonksMMOUserBackend.controller;


import com.stonksmmo.StonksMMOUserBackend.model.User;
import com.stonksmmo.StonksMMOUserBackend.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.POST;

@RestController
@RequestMapping(path = "api/register")
public class UserController {
   private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @POST
    public void addUser(@RequestBody User newUser) {
        userRepository.save(newUser);
    }

}
