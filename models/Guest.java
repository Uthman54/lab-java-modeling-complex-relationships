package com.ironhack.labjavacomplex.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guestId;
    private String guestName;
    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    public Guest(String guestName, GuestStatus status) {
        this.guestName = guestName;
        this.status = status;
    }
}
