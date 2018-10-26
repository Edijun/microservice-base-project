package com.junkodesain.baseproject.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junkodesain.baseproject.model.Borrower;
import com.junkodesain.baseproject.request.BorrowerRequest;
import com.junkodesain.baseproject.response.BorrowerResponse;
import com.junkodesain.baseproject.service.BorrowerService;

@RestController
@RequestMapping("borrowers")
public class BorrowerController {

	@Autowired
	private BorrowerService borrowerService;

	@PostMapping
	public ResponseEntity<BorrowerResponse> save(@RequestBody @Valid BorrowerRequest borrowerRequest) {
		BorrowerResponse borrowerResponse = new BorrowerResponse();

		try {
			Borrower result = borrowerService.create(borrowerRequest);
			borrowerResponse.setSucces(result);
			return new ResponseEntity<BorrowerResponse>(borrowerResponse, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			borrowerResponse.setError(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), "");
			return new ResponseEntity<BorrowerResponse>(borrowerResponse, HttpStatus.BAD_REQUEST);
		}

	}

}
