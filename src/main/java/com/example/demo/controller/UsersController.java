package com.example.demo.controller;

import com.example.demo.model.BookModel;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

    private final UsersService usersService;
    private final BookRepository bookRepository;

    public UsersController(UsersService usersService, BookRepository bookRepository) {

        this.usersService = usersService;
        this.bookRepository = bookRepository;
    }

    @GetMapping("/users")
    public String show(Model model){
        model.addAttribute("bookTable", bookRepository.findAll());
        return "show";
    }
    @GetMapping("/register")
    public String getRegisterPage(Model model)  {
        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }


    @GetMapping("/login")
    public String getLoginPage(Model model)  {
        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";
    }



    @PostMapping("/register")
    public String rigister(@ModelAttribute UsersModel usersModel){
        System.out.println("register request: " + usersModel);
        UsersModel registeredUser = usersService.registerUser(usersModel.getLogin(), usersModel.getPassword(), usersModel.getEmail());
        if(registeredUser == null){
            return "error_page";
        }else{
            return "login_page";
        }
    }


    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel){
        System.out.println("login request: " + usersModel);
        UsersModel authenticateUser = usersService.authenticate(usersModel.getLogin(), usersModel.getPassword());
    if (authenticateUser != null){
     return "booking";
    }else{
        return "error_page";
        }

    }

    @PostMapping("/add")
    public @ResponseBody String addNewUser(@RequestBody BookModel bookModel) {
        bookRepository.save(bookModel);
        System.out.println(bookRepository.findAll());
        return "ok";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<BookModel> getAllUsers() {

        return bookRepository.findAll();
    }

}
