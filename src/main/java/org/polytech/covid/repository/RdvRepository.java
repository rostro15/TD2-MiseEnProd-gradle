package org.polytech.covid.repository;

import org.polytech.covid.domain.Rdv;
import org.polytech.covid.domain.VaccinationCenter;
import org.polytech.covid.domain.Patient;
import org.polytech.covid.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRepository extends JpaRepository<Rdv, Integer> {
    
    public Rdv findByDate(String date);
    public Rdv findByCenter(VaccinationCenter center);
    public Rdv findByPatient(Patient patient);
    public Rdv findByDoctor(Doctor doctor);

}
