package org.polytech.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.polytech.covid.domain.DBUser;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
	public DBUser findByUsername(String username);
}