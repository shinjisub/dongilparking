package com.dev.dongilparking.service.jumin;

import com.dev.dongilparking.domain.car.CarRepository;
import com.dev.dongilparking.domain.jumin.Jumin;
import com.dev.dongilparking.domain.jumin.JuminRepository;
import com.dev.dongilparking.web.dto.car.CarResponseDTO;
import com.dev.dongilparking.web.dto.jumin.JuminResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class JuminService {

    private final JuminRepository juminRepository;
    private final CarRepository carRepository;

    public List<JuminResponseDTO> findAll() {
        //## 테스트 저장

        /*System.out.println("ID : "+juminRepository.save(Jumin.builder()
                .name("101호")
                .representationNumber("01084143320")
                .useFlag("Y")
                .build()));*/

        return juminRepository.findAll().stream()
                .map(JuminResponseDTO::new)
                .collect(Collectors.toList());
    }

    public List<CarResponseDTO> carFindAll() {
        return carRepository.findAll().stream()
                .map(CarResponseDTO::new)
                .collect(Collectors.toList());
    }

}
