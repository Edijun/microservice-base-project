package com.junkodesain.baseproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junkodesain.baseproject.model.Borrower;
import com.junkodesain.baseproject.repository.BorrowerRepository;
import com.junkodesain.baseproject.request.BorrowerRequest;
import com.junkodesain.baseproject.service.BorrowerService;

@Service
public class BorrowerServiceImpl implements BorrowerService {

	@Autowired
	private BorrowerRepository borrowerRepository;

	@Override
	public Borrower findByName(String name) {
		return borrowerRepository.findByName(name);
	}

	@Override
	public Borrower create(BorrowerRequest borrowerRequest) {

		Borrower borrower = new Borrower();

		borrower.setName(borrowerRequest.getName());
		borrower.setAddress(borrowerRequest.getAddress());
		borrower.setPostalCode(borrowerRequest.getPostalCode());
		borrower.setCity(borrowerRequest.getCity());
		borrower.setEmail(borrowerRequest.getEmail());
		borrower.setPhoneNo(borrowerRequest.getPhoneNo());

		return borrowerRepository.save(borrower);
	}

}
