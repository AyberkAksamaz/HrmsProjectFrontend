package com.java.springboot.Demo.HrmsProject.business.abstracts;

import java.util.List;

import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.entities.concretes.JobPosition;

public interface JobPositionService {

	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
