package org.polytech.covid.repository;

import org.polytech.covid.domain.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRepository extends JpaRepository<Rdv, Integer> {
    
    public Rdv findByDate(String date);
}
