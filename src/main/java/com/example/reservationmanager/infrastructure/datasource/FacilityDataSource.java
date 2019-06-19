package com.example.reservationmanager.infrastructure.datasource;

import com.example.reservationmanager.application.repository.FacilityRepository;
import com.example.reservationmanager.domain.model.Facility;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacilityDataSource implements FacilityRepository {
    
    FacilityMapper mapper;

    public FacilityDataSource(FacilityMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Facility> findAll() {
        return mapper.findAll();
    }
}
