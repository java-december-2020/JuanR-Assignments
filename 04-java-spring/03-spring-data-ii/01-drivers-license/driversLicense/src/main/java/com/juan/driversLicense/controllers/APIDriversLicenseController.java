package com.juan.driversLicense.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.driverlicense.models.DriversLicense;

@RestController
@RequestMapping("/api")
public class APIDriversLicenseController {
	@Autowired
	private DriversLicense dService;
	
	//ROUTES
	// /api/
	@GetMapping("/")
	public List<DriversLicense> allDriversLicense() {
		return this.dService.getAllDriversLicense();
	}
	//RETURN SINGLE DRIVERS LICENSE BY ID
	// /api/{id}
	@GetMapping("id")
	public DriversLicense getoneDriversLicense(@PathVariable("id")Long id) {
		return this.dService.getSingleDriversLicense(id);
	}
	// CREATE DRIVERS LICENSE BY TAKING INFORMATION FROM FRONT END
	@PostMapping("/") // ALWAYS USE POST MAPPING FOR CREATING NEW OBJECTS
	public DriversLicense createDriversLicense(DriversLicense newDriversLicense) {
		return this.dService.createDriversLicense(newDriversLicense);
	}
	@PutMapping("/update/{id}")
	public DriversLicense edit(@PathVariable("id")Long id, DriversLicense updatedDriversLicense) {
		return this.dService.updateDriversLicense(updatedDriversLicense);
	}
	
}
