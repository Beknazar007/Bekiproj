package com.example.demo.service;

import com.example.demo.model.BookModel;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository userRepository;
    private final BookRepository bookRepository;
    public UsersService(UsersRepository userRepository, BookRepository bookRepository){

        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
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
