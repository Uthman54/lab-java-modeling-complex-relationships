package com.ironhack.labjavacomplex.repository;

import com.ironhack.labjavacomplex.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
