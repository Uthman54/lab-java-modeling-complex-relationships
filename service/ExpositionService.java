package com.ironhack.labjavacomplex.service;

import com.ironhack.labjavacomplex.models.Exposition;
import com.ironhack.labjavacomplex.repository.ExpositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ExpositionService {
    private ExpositionRepository expositionRepository;

    public List<Exposition> getAllExpositions() {
        return expositionRepository.findAll();
    }

    public Exposition getExpositionById(Long expositionId) {
        return expositionRepository.findById(expositionId).orElseThrow(() -> new RuntimeException("Exposition not found"));
    }


}
