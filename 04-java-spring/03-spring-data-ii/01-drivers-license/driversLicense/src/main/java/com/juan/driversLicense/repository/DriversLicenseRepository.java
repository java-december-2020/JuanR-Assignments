package com.juan.driversLicense.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.driverlicense.models.DriversLicense;

@Repository
public interface DriversLicenseRepository extends CrudRepository<DriversLicense, Long> {
	List<DriversLicense> findAll(); // Finds all from DriversLicense
}
