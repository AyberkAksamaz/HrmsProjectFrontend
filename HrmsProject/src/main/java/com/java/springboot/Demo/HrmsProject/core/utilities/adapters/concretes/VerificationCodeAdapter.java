package com.java.springboot.Demo.HrmsProject.core.utilities.adapters.concretes;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts.VerificationCodeService;

@Repository
public class VerificationCodeAdapter implements VerificationCodeService{

	@Override
	public void sendVerificationLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationemail/" + uuid.toString();
		System.out.println("Verification link has been sent.: " + email);
		System.out.println("Please click the link to verify your account: " + verificationLink);
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Your activation code: " + verificationCode);
		return verificationCode;
	}

}
