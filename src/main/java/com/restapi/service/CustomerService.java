package com.restapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
//import org.jvnet.hk2.annotations.Service;

import com.restapi.model.CustomerDetails;
import com.restapi.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository custRepo;
	
	
	public CustomerDetails createCustomer(CustomerDetails custdet)
	{
		return custRepo.save(custdet);
	}
	
	public CustomerDetails readCustomer(int accid)
	{
		return custRepo.findById(accid).orElse(null);
	}
	
	@Query(value = "update CustomerDetails set balanceAmount = :balance where accid = :cardno")
	public CustomerDetails updateCustomer(@Param("cardno") int id,@Param("balance") String bal)
	{
		return readCustomer(id);
	}


}
