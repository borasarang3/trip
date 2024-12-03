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
@RequestMapping("/tripinformation")
public class InformationController {

    @GetMapping("/register")
    public String reviewRegisterGet() {
        return "tripinformation/register";
    }

    @PostMapping("/register")
    public String reviewRegisterPost() {
        return "tripinformation/register";
    }

    @GetMapping("/list")
    public String reviewList() {
        return "tripinformation/list";
    }

    @GetMapping("/read")
    public String reviewRead() {
        return "tripinformation/read";
    }

    @GetMapping("/modify")
    public String reviewModifyGet() {
        return "tripinformation/modify";
    }

    @PostMapping("/modify")
    public String reviewModifyPost() {
        return "tripinformation/modify";
    }

    @PostMapping("/remove")
    public String reviewRemove() {
        return "tripinformation/modify";
    }

}
