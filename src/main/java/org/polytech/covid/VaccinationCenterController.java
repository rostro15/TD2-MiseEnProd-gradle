package org.polytech.covid.controller;

import java.util.List;
import org.polytech.covid.VaccinationCenter;
import org.polytech.covid.service.VaccinationCenterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class VaccinationCenterController {
    
    @Autowired
    private VaccinationCenterService CenterRepository;

    @GetMapping("/api/centers/{cityName}")
    public List<VaccinationCenter> get(@PathVariable String cityName) {
        return CenterRepository.findALLByCity(cityName);
    }

    @GetMapping("/api/centers")
    public List<VaccinationCenter> getAllCenter() {
        return CenterRepository.findAll();
    }


}
