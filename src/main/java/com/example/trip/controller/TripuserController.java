package com.example.trip.controller;

import com.example.trip.constant.Role;
import com.example.trip.dto.TripuserDTO;
import com.example.trip.service.TripuserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/tripuser")
public class TripuserController {

    private final TripuserService tripuserService;

    @GetMapping("/terms")
    public String terms () {
        return "tripuser/terms";
    }

    @GetMapping("/signup")
    public String signupGet (Model model) {

        TripuserDTO tripuserDTO = new TripuserDTO();
        tripuserDTO.setRole(Role.USER);
        model.addAttribute("tripuserDTO", tripuserDTO);

        return "tripuser/signup";
    }

    @GetMapping("/adminsignup")
    public String adminSignupGet (Model model) {

        TripuserDTO tripuserDTO = new TripuserDTO();
        tripuserDTO.setRole(Role.ADMIN);
        model.addAttribute("tripuserDTO", tripuserDTO);

        return "tripuser/signup";
    }

    @PostMapping("/signup")
    public String signupPost (@Valid TripuserDTO tripuserDTO, BindingResult bindingResult,
                              RedirectAttributes redirectAttributes, Model model) {

        log.info("회원가입 : " + tripuserDTO );
        if (bindingResult.hasErrors()) {

            log.info(bindingResult.getAllErrors());

            return "tripuser/signup";
        }

        try {
            tripuserService.saveTripuser(tripuserDTO);
        } catch (IllegalStateException e) {

            model.addAttribute("msg", e.getMessage());

            return "tripuser/signup";

        }

        redirectAttributes.addFlashAttribute("msg", "회원가입이 완료되었습니다.");

        return "redirect:/tripuser/login";
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
