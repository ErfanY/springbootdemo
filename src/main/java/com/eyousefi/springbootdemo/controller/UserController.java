package com.eyousefi.springbootdemo.controller;

import com.eyousefi.springbootdemo.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
   final UserRepository userRepository;

   public UserController(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

}
