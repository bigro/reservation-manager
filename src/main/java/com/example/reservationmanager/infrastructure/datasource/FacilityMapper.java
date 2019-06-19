package com.example.reservationmanager.infrastructure.datasource;

import com.example.reservationmanager.domain.model.Facility;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FacilityMapper {
    
    List<Facility> findAll();
}
