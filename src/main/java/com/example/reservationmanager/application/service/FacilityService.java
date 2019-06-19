package com.example.reservationmanager.application.service;

import com.example.reservationmanager.application.repository.FacilityRepository;
import com.example.reservationmanager.domain.model.Facility;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService {
    
    FacilityRepository repository;

    public FacilityService(FacilityRepository repository) {
        this.repository = repository;
    }

    public List<Facility> findAll() {
        return repository.findAll();
    }
}
