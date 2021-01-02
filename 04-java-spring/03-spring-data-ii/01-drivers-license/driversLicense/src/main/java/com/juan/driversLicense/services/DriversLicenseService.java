package com.juan.driversLicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.driverlicense.models.DriversLicense;
import com.juan.driversLicense.repository.DriversLicenseRepository;

@Service
public class DriversLicenseService {
	private DriversLicenseRepository dRepo;
	
	public DriversLicenseService(DriversLicenseRepository driversLicenseRepository) {
		this.dRepo = driversLicenseRepository;
	}
	
	// RETRIEVE ALL
	public List<DriversLicense> getAllDriversLicense() {
		return this.dRepo.findAll();
	}
	
	
	// CREATE
	public DriversLicense createDriversLicense(DriversLicenseService newDriversLicense) {
		return this.dRepo.save(newDriversLicense);
	}
	public DriversLicense createDriversLicense(String first_name, String last_name, String state, int expiration_date) {
		DriversLicense newDriversLicense = new DriversLicense(first_name,last_name, state, expiration_date);
		return this.dRepo.save(newDriversLicense);
	}
	
	// READ
	public com.juan.driverlicense.models.DriversLicense getSingleDriversLicense(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	//UPDATE
	public DriversLicense updateDriversLicense(DriversLicense updateDriversLicense) {
		return this.dRepo.save(updateDriversLicense);
	}
	
	//DELETE
	public void deleteDriversLicense(Long id) {
		this.dRepo.deleteById(id);
	}
}
