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
@RequestMapping("/tripreview")
public class ReviewController {

    @GetMapping("/register")
    public String reviewRegisterGet() {
        return "tripreview/register";
    }

    @PostMapping("/register")
    public String reviewRegisterPost() {
        return "tripreview/register";
    }

    @GetMapping("/list")
    public String reviewList() {
        return "tripreview/list";
    }

    @GetMapping("/read")
    public String reviewRead() {
        return "tripreview/read";
    }

    @GetMapping("/modify")
    public String reviewModifyGet() {
        return "tripreview/modify";
    }

    @PostMapping("/modify")
    public String reviewModifyPost() {
        return "tripreview/modify";
    }

    @PostMapping("/remove")
    public String reviewRemove() {
        return "tripreview/modify";
    }

}
