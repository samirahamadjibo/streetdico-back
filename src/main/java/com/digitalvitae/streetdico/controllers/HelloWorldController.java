package com.digitalvitae.streetdico.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping
public class HelloWorldController {
    @GetMapping("/hello")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
}
