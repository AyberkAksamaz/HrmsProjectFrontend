package com.java.springboot.Demo.HrmsProject.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springboot.Demo.HrmsProject.business.abstracts.ApplicantService;
import com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts.MailCheckService;
import com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts.MernisCheckService;
import com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts.VerificationCodeService;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.DataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.ErrorResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.Result;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessDataResult;
import com.java.springboot.Demo.HrmsProject.core.utilities.result.SuccessResult;
import com.java.springboot.Demo.HrmsProject.dataAccess.abstracts.ApplicantDao;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Applicant;

@Service
public class ApplicantManager implements ApplicantService{

	private ApplicantDao applicantDao;
	private MailCheckService mailCheckService;
	//private MernisCheckService mernisCheckService;
	private VerificationCodeService verificationCodeService;
	
	@Autowired
	public ApplicantManager(ApplicantDao applicantDao, MailCheckService mailCheckService, VerificationCodeService verificationCodeService,
			MernisCheckService mernisCheckService) {
		super();
		this.applicantDao = applicantDao;
		this.mailCheckService = mailCheckService;
		//this.mernisCheckService = mernisCheckService;
		this.verificationCodeService = verificationCodeService;
	}

	@Override
	public DataResult<List<Applicant>> getAll() {
		return new SuccessDataResult<List<Applicant>>(this.applicantDao.findAll(), "Applicants listed");
		
	}

	@Override
	public Result add(Applicant applicant){
		if((this.mailCheckService.checkEmail(applicant))) {
			this.applicantDao.save(applicant);
			this.verificationCodeService.sendVerificationLink(applicant.getEmail());
			this.verificationCodeService.sendCode();
			return new SuccessResult("Applicant added!!");
		}
		return new ErrorResult("Cannot add applicant!!!");
	}

	
}
