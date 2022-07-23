package com.restapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.CustomerDetails;
import com.restapi.service.CustomerService;


@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired 
	CustomerService custservice;
	
	@RequestMapping(value = "/getcustomer",method = RequestMethod.GET)
	public CustomerDetails getCustomerById(@RequestBody int accid)
	{
		return custservice.readCustomer(accid);
	}
	@RequestMapping(value = "/customer",method = RequestMethod.POST)
	public CustomerDetails createCustomer(@RequestBody CustomerDetails custdet)
	{
		return custservice.createCustomer(custdet);
	}

}
