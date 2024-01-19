package com.blackbucks.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SeatTypeShow extends BaseModel{

    @Enumerated(value = EnumType.ORDINAL)
    private SeatType seatType;
    @ManyToOne
    private Show show;
    private double price;
}
