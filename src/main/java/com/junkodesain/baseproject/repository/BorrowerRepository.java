package com.junkodesain.baseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.junkodesain.baseproject.model.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Integer>, JpaSpecificationExecutor<Borrower> {

	Borrower findByName(String name);

}