package com.example.reservationmanager.controller;

import com.example.reservationmanager.domain.model.Base;
import com.example.reservationmanager.domain.model.Facility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Collections;

@Controller
public class FacilityController {
    
    @GetMapping()
    String list(Model model) {
        Base base = new Base(1, "関西");
        Facility facility = new Facility(1, "第一会議室", base);
        model.addAttribute("facilities", Collections.singletonList(facility));
        return "facility-list";
    }
}
