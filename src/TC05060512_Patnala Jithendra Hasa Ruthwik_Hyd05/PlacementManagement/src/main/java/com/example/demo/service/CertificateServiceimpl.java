package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;

@Service
public class CertificateServiceimpl implements CertificateService {

	@Autowired 
	CertificateRepository certificateRepository;

	@Override
	public Certificate saveCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		return certificateRepository.save(certificate);
	}

	@Override
	public List<Certificate> fetchCertificateList() {
		// TODO Auto-generated method stub
		return certificateRepository.findAll();
	}

	@Override
	public Certificate fetchCertificateById(Long certificateId) {
		// TODO Auto-generated method stub
		return certificateRepository.findById(certificateId).get();
	}

	@Override
	public void deleteCertificateById(Long certificateId) {
		// TODO Auto-generated method stub
		certificateRepository.deleteById(certificateId);
	}

	@Override
	   public Certificate updateCertificate(Long certificateId, Certificate certificate) {
	       Certificate cerDB = certificateRepository.findById(certificateId).get();

	       if(Objects.nonNull(certificate.getYear()) &&
	       !"".equalsIgnoreCase(certificate.getYear())) {
	           cerDB.setYear(certificate.getYear());
	       }

	       if(Objects.nonNull(certificate.getCollege()) &&
	    	       !"".equalsIgnoreCase(certificate.getCollege())) {
	    	           cerDB.setCollege(certificate.getCollege());
	       }

	       return certificateRepository.save(cerDB);
	   }
} 
  