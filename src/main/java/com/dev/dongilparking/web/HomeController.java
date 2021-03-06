package com.dev.dongilparking.web;

import com.dev.dongilparking.service.jumin.JuminService;
import com.dev.dongilparking.web.dto.car.CarResponseDTO;
import com.dev.dongilparking.web.dto.jumin.JuminResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final JuminService juminService;

    @GetMapping("/")
    public String home() {
        for (JuminResponseDTO dto :juminService.findAll()) {
            System.out.println("유저 명 : "+dto.getName());
        }

        for (CarResponseDTO dto :juminService.carFindAll()) {
            System.out.println("차 키번호 : "+dto.getCarKey());
        }
        return "index";
    }
}
