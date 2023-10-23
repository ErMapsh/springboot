package com.ermapsh.first_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Signup {
    @RequestMapping("/signup")
    public String registration() {
        return "Thank you for signup";
    }

    @RequestMapping("/signup/confirm")
    public String signup() {
        return "Thank you for signup confirm";
    }
}
