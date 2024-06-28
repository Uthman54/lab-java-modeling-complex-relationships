package com.ironhack.labjavacomplex.repository;

import com.ironhack.labjavacomplex.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
