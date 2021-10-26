package com.java.springboot.Demo.HrmsProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "applicants")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Applicant  extends User{

	@NotNull
	@Column(name = "applicants_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ApplicantID;
	
	@Column(name = "first_name")
	private String ApplicantFirstName;
	
	@Column(name = "last_name")
	private String ApplicantLastName;
	
	@Column(name = "national_id")
	private long NationalID;
	
	@Column(name = "birth_year")
	private int BirthYear;
}
