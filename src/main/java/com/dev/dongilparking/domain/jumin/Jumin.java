package com.dev.dongilparking.domain.jumin;

import com.dev.dongilparking.BaseDateEntity;
import com.dev.dongilparking.domain.car.Car;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Jumin extends BaseDateEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long juminId;

    private String name;

    private String representationNumber;

    private String useFlag;

    @OneToMany(mappedBy = "jumin")
    private List<Car> Car = new ArrayList<>();

    @Builder
    public Jumin(String name, String representationNumber, String useFlag) {
        this.name = name;
        this.representationNumber = representationNumber;
        this.useFlag = useFlag;
    }

}
