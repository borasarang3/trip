package com.example.trip.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/tripuser")
public class TripuserController {

    @GetMapping("/terms")
    public String terms () {
        return "tripuser/terms";
    }

    @GetMapping("/signup")
    public String signupGet () {
        return "tripuser/signup";
    }

    @GetMapping("/adminsignup")
    public String adminSignupGet () {
        return "tripuser/signup";
    }

    @PostMapping("/signup")
    public String signupPost () {
        return "tripuser/signup";
    }

    @GetMapping("/login")
    public String loginGet () {
        return "tripuser/login";
    }

    @GetMapping("/findID")
    public String findIDGet () {
        return "tripuser/findID";
    }

    @PostMapping("/findID")
    public String findIDPost () {
        return "tripuser/findID";
    }

    @GetMapping("/findPW")
    public String findPWGet () {
        return "tripuser/findPW";
    }

    @PostMapping("/findPW")
    public String findPWPost () {
        return "tripuser/findPW";
    }

    @PostMapping("/changePW")
    public String changePW () {
        return "tripuser/findPW";
    }


}
