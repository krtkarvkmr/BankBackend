package com.restapi.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.CardDetails;
import com.restapi.model.CardDetailsHelper;
import com.restapi.model.CustomerDetails;
import com.restapi.service.CardService;
import com.restapi.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CardController {
	
	@Autowired 
	//to connect with another class
	CardService cardservice;
	
	@Autowired
	CustomerService custservice;
	
	@RequestMapping(value = "/card",method = RequestMethod.POST)
	public CardDetails createCard(@RequestBody CardDetailsHelper carddet)
	{
		CustomerDetails cust = custservice.readCustomer(carddet.getCardholderId());
		return cardservice.createCard(new CardDetails(carddet.getCardNo(),carddet.getCardType(),carddet.getCardExpiry(),cust));
	}
}