package com.ironhack.labjavacomplex.repository;

import com.ironhack.labjavacomplex.models.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
