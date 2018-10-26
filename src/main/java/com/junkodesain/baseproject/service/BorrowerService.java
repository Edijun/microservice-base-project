package com.junkodesain.baseproject.service;

import com.junkodesain.baseproject.model.Borrower;
import com.junkodesain.baseproject.request.BorrowerRequest;

public interface BorrowerService {
	
	Borrower findByName(String name);
	
	Borrower create(BorrowerRequest borrowerRequest);

}
