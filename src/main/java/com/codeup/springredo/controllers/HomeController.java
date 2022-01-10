package com.codeup.springredo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "This is the landing page!";
    }

    @GetMapping("/home")
    public String welcome(){
        return "home";
    }

}
