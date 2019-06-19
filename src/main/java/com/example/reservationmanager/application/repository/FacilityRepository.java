package com.example.reservationmanager.application.repository;

import com.example.reservationmanager.domain.model.Facility;

import java.util.List;

public interface FacilityRepository {
    List<Facility> findAll();
}
