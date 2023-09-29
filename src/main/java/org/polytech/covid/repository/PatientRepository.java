package org.polytech.covid.repository;


import org.polytech.covid.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PatientRepository extends JpaRepository<Patient, Integer> {
    
    public List<Patient> findAllByMail(String mail);
    public List<Patient> findAllByPhone(String phone);
    public List<Patient> findAllByFirstName(String firstName);
    public List<Patient> findAllByLastName(String lastName);

}
