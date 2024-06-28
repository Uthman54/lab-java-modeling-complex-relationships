package com.ironhack.labjavacomplex.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="events")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    private LocalDate date;
    private String duration;
    private String title;
    private String location;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_id")
    private List<Guest> guests;

    public Event(LocalDate date, String duration, String title, String location, List<Guest> guests) {
        this.date = date;
        this.duration = duration;
        this.title = title;
        this.location = location;
        this.guests = guests;
    }
}
