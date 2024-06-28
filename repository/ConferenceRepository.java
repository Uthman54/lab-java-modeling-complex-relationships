package com.ironhack.labjavacomplex.repository;

import com.ironhack.labjavacomplex.models.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
