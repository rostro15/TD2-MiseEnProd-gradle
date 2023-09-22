package org.polytech.covid.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.polytech.covid.domain.VaccinationCenter;
import org.polytech.covid.repository.VaccinationCenterRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VaccinationCenterService {
    
    @Autowired
    private VaccinationCenterRepository CenterRepository;

    public List<VaccinationCenter> findAllByCity(String cityName) {
        return CenterRepository.findAllByCity(cityName);
    }

    public List<VaccinationCenter> findAll() {
        return CenterRepository.findAll();
    }
}
