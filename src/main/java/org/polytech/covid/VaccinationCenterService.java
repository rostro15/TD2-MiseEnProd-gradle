package org.polytech.covid.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.polytech.covid.VaccinationCenter;
import org.polytech.covid.repository.VaccinationCenterRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VaccinationCenterService {
    
    @Autowired
    private VaccinationCenterRepository CenterRepository;

    public List<VaccinationCenter> findALLByCity(String cityName) {
        return CenterRepository.findALLByCity(cityName);
    }

    public List<VaccinationCenter> findAll() {
        return CenterRepository.findAll();
    }
}
