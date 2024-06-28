package com.ironhack.labjavacomplex.service;

import com.ironhack.labjavacomplex.models.Conference;
import com.ironhack.labjavacomplex.repository.ConferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ConferenceService {
    private final ConferenceRepository conferenceRepository;

    public List<Conference> getAllConferences() {
        return conferenceRepository.findAll();
    }

    public Conference getConferenceById(Long conferenceId) {
        return conferenceRepository.findById(conferenceId).orElseThrow(() -> new RuntimeException("Conference not found"));
    }
}
