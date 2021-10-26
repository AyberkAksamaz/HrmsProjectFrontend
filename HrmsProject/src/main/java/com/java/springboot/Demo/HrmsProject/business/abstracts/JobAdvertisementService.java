package com.java.springboot.Demo.HrmsProject.business.abstracts;

import java.util.List;

import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	//Result setActiveToPassive(int id);
	DataResult<List<JobAdvertisement>> getAll();
	//DataResult<List<JobAdvertisement>> getAllActiveJobAdvertisement();
	DataResult<List<JobAdvertisement>> getByisActive(boolean active);
	DataResult<List<JobAdvertisement>> getByJobAdvertisementOrderByDate();
}
