package com.ironhack.labjavacomplex.service;

import com.ironhack.labjavacomplex.models.Guest;
import com.ironhack.labjavacomplex.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional@RequiredArgsConstructor
public class GuestService {
    private final GuestRepository guestRepository;
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    public Optional<Guest> getGuestById(Long guestId) {
        return guestRepository.findById(guestId);
    }
}
