package com.ironhack.labjavacomplex.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name="speakers")
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int speakerId;
    private String speakerName;
    private String presentationDuration;

    public Speaker(String speakerName, String presentationDuration) {
        this.speakerName = speakerName;
        this.presentationDuration = presentationDuration;
    }
}
