package com.java.springboot.Demo.HrmsProject.business.abstracts;

import java.util.List;

import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Employer;


public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(Employer employer);

}
