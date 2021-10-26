package com.java.springboot.Demo.HrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springboot.Demo.HrmsProject.entities.concretes.Applicant;

public interface ApplicantDao extends JpaRepository<Applicant, Integer>{

}
