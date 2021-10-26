package com.java.springboot.Demo.HrmsProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.springboot.Demo.HrmsProject.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	List<JobAdvertisement> getByisActive(boolean active);
	
	@Query("From JobAdvertisement ORDER BY releaseDate ASC")
	List<JobAdvertisement> getByJobAdvertisementOrderByDate();
}
