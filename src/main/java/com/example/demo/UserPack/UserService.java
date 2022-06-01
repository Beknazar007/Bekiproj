package com.example.demo.UserPack;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class UserService {
    @GetMapping
    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Beknazar",
                        "Saittegin",
                        "beki@gmail.com",
                        23


                )
        );
    }
}
