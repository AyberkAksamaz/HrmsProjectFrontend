package com.java.springboot.Demo.HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.Demo.HrmsProject.business.abstracts.ApplicantService;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Applicant;


import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/api/applicants")
public class ApplicantsController {

	private ApplicantService applicantService;
	
	@Autowired
	public ApplicantsController(ApplicantService applicantService) {
		super();
		this.applicantService = applicantService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Applicant>> getAll() {	
		return this.applicantService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Applicant applicant) {
		return this.applicantService.add(applicant);
	}
}
