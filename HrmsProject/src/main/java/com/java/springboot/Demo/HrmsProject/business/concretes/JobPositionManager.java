package com.java.springboot.Demo.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.Demo.HrmsProject.business.abstracts.JobPositionService;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessDataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessResult;
import com.java.springboot.Demo.HrmsProject.dataAccess.abstracts.JobPositionDao;
import com.java.springboot.Demo.HrmsProject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Data listed!");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Job position added");
	}


}
