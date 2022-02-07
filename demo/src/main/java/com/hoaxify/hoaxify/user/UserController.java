package com.hoaxify.hoaxify.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserSevice userSevice;

    @PostMapping("/api/1.0/users")
    void createUser(@RequestBody User user) {
        userSevice.save(user);
    }
}
