package com.java.springboot.Demo.HrmsProject.core.utilities.adapters.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;

import org.springframework.stereotype.Repository;

import com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts.MailCheckService;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Applicant;

@Repository
public class MailCheckAdapter implements MailCheckService{

	ArrayList<String> listOfEmail = new ArrayList<String>();
	
	String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);


	@Override
	public boolean checkEmail(Applicant user) {    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		if(listOfEmail.contains(user.getEmail())) {
			System.out.println("Mail address is been taken!");
			return false;
		}
		if(pattern.matcher(user.getEmail()).find() == false) {
			System.out.println("Email is not in the format!");
			return false;
		}
		listOfEmail.add(user.getEmail());
		return true;
	}
	
}
