package com.example.demo.controller;

import com.example.demo.model.UsersModel;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
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
        return registeredUser == null ? "error_page" : "redirect:/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel){
        System.out.println("register request: " + usersModel);
        UsersModel authenticateUser = usersService.authenticate(usersModel.getLogin(), usersModel.getPassword());
    if (authenticateUser != null){
     return "order_page";
    }else{
        return "error_page";
    }
    }

}
