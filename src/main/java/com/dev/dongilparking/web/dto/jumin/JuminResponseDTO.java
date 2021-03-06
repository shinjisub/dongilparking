package com.dev.dongilparking.web.dto.jumin;

import com.dev.dongilparking.domain.jumin.Jumin;
import lombok.Getter;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class JuminResponseDTO {

    private String name;

    private String representationNumber;

    private String useFlag;

    private LocalDateTime creationDate;

    private LocalDateTime lastUpdateDate;

    public JuminResponseDTO(Jumin entity) {
        this.name = entity.getName();
        this.useFlag = entity.getUseFlag();
        this.representationNumber = entity.getRepresentationNumber();
        this.creationDate = entity.getCreationDate();
        this.lastUpdateDate = entity.getLastUpdateDate();
    }
}
