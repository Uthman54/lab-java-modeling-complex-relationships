package com.ironhack.labjavacomplex.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Entity
@NoArgsConstructor

public class Exposition extends Event{
    public Exposition(LocalDate date, String duration, String title, String location, List<Guest> guests) {
        super(date, duration, title, location, guests);
    }
}
