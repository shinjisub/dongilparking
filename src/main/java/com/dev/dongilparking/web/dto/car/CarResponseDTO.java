package com.dev.dongilparking.web.dto.car;

import com.dev.dongilparking.domain.car.Car;
import com.dev.dongilparking.domain.jumin.Jumin;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CarResponseDTO {

    private String carNumber;

    private String carKey;

    private String useFlag;

    private String creationId;

    private LocalDateTime creationDate;

    private String lastUpdateId;

    private LocalDateTime lastUpdateDate;

    private Jumin jumin;


    public CarResponseDTO(Car entity) {
        this.carNumber = entity.getCarNumber();
        this.useFlag = entity.getCarKey();
        this.useFlag = entity.getUseFlag();
        this.creationId = entity.getCreationId();
        this.lastUpdateId = entity.getLastUpdateId();
        this.lastUpdateDate = entity.getLastUpdateDate();
        this.jumin = entity.getJumin();
    }
}
