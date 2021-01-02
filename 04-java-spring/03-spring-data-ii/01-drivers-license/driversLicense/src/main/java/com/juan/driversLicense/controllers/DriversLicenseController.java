package com.juan.driversLicense.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.juan.driverlicense.models.DriversLicense;

@Controller
public class DriversLicenseController {
	@Autowired
	private class DriversLicenseService sService;
	@GetMapping("/")
	public String index(Model viewModel) {
		List<DriversLicense> allDriversLicense = this.sService.getAllDriversLicense();
		viewModel.addAttribute("allDriversLicense", allDriversLicense);
		return "index.jsp";
	}
}
