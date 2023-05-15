package dev.sociallogin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/")
    public String login(){

        return "Welcome";
    }


    @GetMapping("/secured")
    public String secured(){

        return "Welcome secured";
    }

}
