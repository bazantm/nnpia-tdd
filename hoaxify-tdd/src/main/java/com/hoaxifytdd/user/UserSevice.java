package com.hoaxifytdd.user;

import org.springframework.stereotype.Service;

@Service
public class UserSevice {

    UserRepository userRepository;

    public UserSevice(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}

