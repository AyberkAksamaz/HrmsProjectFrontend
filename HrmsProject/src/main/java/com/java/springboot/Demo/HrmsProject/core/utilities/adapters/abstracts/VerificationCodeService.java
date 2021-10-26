package com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts;

public interface VerificationCodeService {

	void sendVerificationLink(String email);
	String sendCode();
}
