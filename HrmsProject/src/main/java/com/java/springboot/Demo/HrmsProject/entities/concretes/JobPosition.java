package com.java.springboot.Demo.HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="jobs_id")
	private int id;
	
	@Column(name="jobs_name")
	private String JobName;
	
	public JobPosition() {
		
	}
	
	public JobPosition(int id, String jobName) {
		super();
		this.id = id;
		JobName = jobName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return JobName;
	}

	public void setJobName(String jobName) {
		JobName = jobName;
	}
	
	
}
