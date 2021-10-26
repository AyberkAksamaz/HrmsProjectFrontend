package com.java.springboot.Demo.HrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.Demo.HrmsProject.business.abstracts.JobAdvertisementService;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessDataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessResult;
import com.java.springboot.Demo.HrmsProject.dataAccess.abstracts.JobAdvertisementDao;
import com.java.springboot.Demo.HrmsProject.entities.concretes.JobAdvertisement;

@Service
public class JobAdveertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdveertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job Advertisemend added.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),
				"Job Advertisements listed.");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByisActive(boolean active) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByisActive(active),
				"Active Jobs Advertisement listed.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByJobAdvertisementOrderByDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByJobAdvertisementOrderByDate(),
				"Job Advertisement Ordered by Date");
	}




}
