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
@RequestMapping("/mypage")
public class MypageController {

    @GetMapping("")
    public String mypage() {
        return "mypage";
    }

    @GetMapping("/modify")
    public String mypageModifyGet() {
        return "mypage/modify";
    }

    @PostMapping("/modify")
    public String mypageModifyPost() {
        return "mypage/modify";
    }

    @PostMapping("/quit")
    public String mypageQuit() {
        return "mypage/modify";
    }

    @GetMapping("/favoriteCourse")
    public String favoriteCourse() {
        return "mypage/favoriteCourse";
    }

    @GetMapping("/favoriteReview")
    public String favoriteReview() {
        return "mypage/favoriteReview";
    }

    @GetMapping("/myCourse")
    public String myCourse() {
        return "mypage/myCourse";
    }

    @GetMapping("/myReview")
    public String myReview() {
        return "mypage/myReview";
    }

    @GetMapping("/myInformation")
    public String myInformation() {
        return "mypage/myInformation";
    }

    @GetMapping("/myReply")
    public String myReply() {
        return "mypage/myReply";
    }

    @GetMapping("/admin/tripuserList")
    public String admintripuserList() {
        return "mypage/admin/tripuserList";
    }

    @GetMapping("/admin/course")
    public String adminCourse() {
        return "mypage/admin/course";
    }

    @GetMapping("/admin/review")
    public String adminReview() {
        return "mypage/admin/review";
    }

    @GetMapping("/admin/information")
    public String adminInformation() {
        return "mypage/admin/information";
    }

    @GetMapping("/admin/reply")
    public String adminReply() {
        return "mypage/admin/reply";
    }


}
