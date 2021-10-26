package com.java.springboot.Demo.HrmsProject.core.utilities.adapters.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Repository;

import com.java.springboot.Demo.HrmsProject.core.utilities.adapters.abstracts.MernisCheckService;
import com.java.springboot.Demo.HrmsProject.entities.concretes.Applicant;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Repository
public class MernisCheckAdapter implements MernisCheckService{

	
	@Override
	public boolean checkIfRealPerson(Applicant applicant) {
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(applicant.getNationalID(),
				    applicant.getApplicantFirstName(),
					applicant.getApplicantLastName(), 
					applicant.getBirthYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}



}
