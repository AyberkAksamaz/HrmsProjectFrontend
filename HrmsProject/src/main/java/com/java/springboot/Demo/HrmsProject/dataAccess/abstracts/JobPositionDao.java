package com.java.springboot.Demo.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.Demo.HrmsProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition ,Integer>{

}
