package org.polytech.covid.service;

import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.polytech.covid.domain.VaccinationCenter;
import org.polytech.covid.repository.VaccinationCenterRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VaccinationCenterService {
    
    @Autowired
    private VaccinationCenterRepository CenterRepository;
    EntityManager entityManager;

    public VaccinationCenter findById(Integer id) {
        Optional<VaccinationCenter> center =  CenterRepository.findById(id);
        if (center == null) {
            return null;
        }
        return center.get();
    }

    public List<VaccinationCenter> findAllByCity(String cityName) {
        return CenterRepository.findAllByCity(cityName);
    }

    public List<VaccinationCenter> findAll() {
        return CenterRepository.findAll();
    }

    public void addCenter(VaccinationCenter center) {    
        CenterRepository.save(center);
    }


    public void deleteCenter(Integer id) {
        CenterRepository.deleteById(id);
    }

}
