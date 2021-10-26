package com.java.springboot.Demo.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.Demo.HrmsProject.business.abstracts.EmployerService;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessDataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessResult;
import com.java.springboot.Demo.HrmsProject.dataAccess.abstracts.EmployerDao;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Employer;

@Service
public class EmloyerManager implements EmployerService{

	private EmployerDao employerDao;

	
	@Autowired
	public EmloyerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers listed.");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer added.");
	}





}
