package com.java.springboot.Demo.HrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.Demo.HrmsProject.business.abstracts.JobAdvertisementService;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.entities.concretes.JobAdvertisement;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/JobsAdvertisement")
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getAllActiveOrPasifJobAdvertisement")
	public DataResult<List<JobAdvertisement>> getByisActive(boolean active) {
		return this.jobAdvertisementService.getByisActive(active);
	}

	@GetMapping("OrderByDate")
	public DataResult<List<JobAdvertisement>> getByJobAdvertisementOrderByDate() {
		return this.jobAdvertisementService.getByJobAdvertisementOrderByDate();
	}
}
