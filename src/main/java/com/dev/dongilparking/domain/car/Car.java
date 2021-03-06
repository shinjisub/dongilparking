package com.dev.dongilparking.domain.car;

import com.dev.dongilparking.BaseDateEntity;
import com.dev.dongilparking.domain.jumin.Jumin;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Car extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    @Column(name = "car_number")
    private String carNumber;

    private String carKey;

    private String useFlag;

    private String creationId;

    private String lastUpdateId;

    @ManyToOne
    @JoinColumn(name = "jumin_id")
    private Jumin jumin;


    @Builder
    public Car(String carNumber, String carKey, String juminId, String useFlag, String creationId, String lastUpdateId) {
        this.carNumber = carNumber;
        this.carKey = carKey;
        this.useFlag = useFlag;
        this.creationId = creationId;
        this.lastUpdateId = lastUpdateId;
    }
}
