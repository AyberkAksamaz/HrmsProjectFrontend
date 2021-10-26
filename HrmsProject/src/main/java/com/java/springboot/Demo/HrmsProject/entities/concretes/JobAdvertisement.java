package com.java.springboot.Demo.HrmsProject.entities.concretes;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobs_advs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobs_advs_id")
	private int JobAdId;
	
	@Column(name = "job_descriptions")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "number_of_open_position")
	private int  numberOfOpenPosition;
	
	@Column(name = "application_deadline")
	private Date applicationDeadline;
	
	@Column(name = "release_date")
	private Date releaseDate;
	
	@Column(name = "is_active")
	private boolean isActive;

	@ManyToOne(cascade = {CascadeType.ALL})   //https://stackoverflow.com/questions/2302802/how-to-fix-the-hibernate-object-references-an-unsaved-transient-instance-save
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "jobs_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "employers_id")
	private Employer employer;
	
}
