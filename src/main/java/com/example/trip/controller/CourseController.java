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
@RequestMapping("/tripcourse")
public class CourseController {

    @PostMapping("/register")
    public String courseRegisterPost() {
        return "tripcourse/register";
    }

    @GetMapping("/list")
    public String courseList() {
        return "tripcourse/list";
    }

    @GetMapping("/read")
    public String courseRead() {
        return "tripcourse/read";
    }

    @GetMapping("/modify")
    public String courseModifyGet() {
        return "tripcourse/modify";
    }

    @PostMapping("/modify")
    public String courseModifyPost() {
        return "tripcourse/modify";
    }

    @PostMapping("/remove")
    public String courseRemove() {
        return "tripcourse/modify";
    }
    
}
