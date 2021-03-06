package com.dev.dongilparking.web;

import com.dev.dongilparking.service.car.CarService;
import com.dev.dongilparking.service.jumin.JuminService;
import com.dev.dongilparking.web.dto.car.CarResponseDTO;
import com.dev.dongilparking.web.dto.jumin.JuminResponseDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final JuminService juminService;
    private final CarService carService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String home() {
        logger.debug("### Controller Start");
        carService.findAllDesc();
        return "index";
    }
}
