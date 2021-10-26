package com.java.springboot.Demo.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Employer;
import com.java.springboot.Demo.HrmsProject.entities.concretes.JobAdvertisement;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	//Result CloseJobAdv(JobAdvertisement jobAdversitement);
}
