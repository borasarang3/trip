package com.example.trip.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/reply")
public class RestReplyController {


    @PostMapping("/register")
    public String replyRegister() {
        return "tripreview/register";
    }

    @PostMapping("/list")
    public String replyList() {
        return "tripreview/list";
    }

    @PostMapping("/read")
    public String replyRead() {
        return "tripreview/read";
    }

    @PostMapping("/modify")
    public String replyModify() {
        return "tripreview/modify";
    }

    @PostMapping("/remove")
    public String replyRemove() {
        return "tripreview/modify";
    }

}
