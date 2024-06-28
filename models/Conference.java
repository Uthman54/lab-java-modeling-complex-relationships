package com.ironhack.labjavacomplex.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor

public class Conference extends Event {
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

    public Conference(LocalDate date, String duration, String title, String location, List<Guest> guests, List<Speaker> speakers) {
        super(date, duration, title, location, guests);
        this.speakers = speakers;
    }
}
