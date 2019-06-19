package com.example.reservationmanager.controller;

import com.example.reservationmanager.application.service.FacilityService;
import com.example.reservationmanager.domain.model.Facility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FacilityController {
    
    FacilityService service;

    public FacilityController(FacilityService service) {
        this.service = service;
    }

    @GetMapping()
    String list(Model model) {
        List<Facility> facilities = service.findAll();
        model.addAttribute("facilities", facilities);
        return "facility-list";
    }
}
