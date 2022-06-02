package com.example.demo.service;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository userRepository;
    public UsersService(UsersRepository userRepository){

        this.userRepository = userRepository;
    }

    public UsersModel registerUser(String login, String password, String email){
        if (login == null || password == null){
            return null;
        }else{
            UsersModel userModel = new UsersModel();
            userModel.setLogin(login);
            userModel.setPassword(password);
            userModel.setEmail(email);
            return userRepository.save(userModel);
        }
    }

    public UsersModel authenticate(String login, String password){
        return  userRepository.findByLoginAndPassword(login, password).orElse(null);

    }
}
