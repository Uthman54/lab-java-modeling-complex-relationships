package com.ironhack.labjavacomplex.service;

import com.ironhack.labjavacomplex.models.Speaker;
import com.ironhack.labjavacomplex.repository.SpeakerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional@RequiredArgsConstructor
public class SpeakerService {
    private final SpeakerRepository speakerRepository;
    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    public Speaker getSpeakerById(Long speakerId) {
        return speakerRepository.findById(speakerId)
                .orElseThrow(() -> new RuntimeException("Speaker not found"));
    }
}
