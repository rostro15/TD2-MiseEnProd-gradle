package org.polytech.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.polytech.covid.VaccinationCenter;
import java.util.List;



public interface VaccinationCenterRepository 
    extends JpaRepository<VaccinationCenter, Integer> {

        public List<VaccinationCenter> findALLByCity(String city);

    
}  