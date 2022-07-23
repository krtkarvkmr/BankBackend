package com.restapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.restapi.model.CardDetails;
import com.restapi.repository.CardRepository;

@Service
public class CardService {
	
	@Autowired
	CardRepository cardrepo;
	
	
	public CardDetails createCard(CardDetails carddet)
	{
		return cardrepo.save(carddet);
	}
	
	public Optional<CardDetails> readCard(int cardNo)
	{
		return cardrepo.findById(cardNo);
	}
	
	@Query(value = "update CardDetails set cardType = :cardtype where cardNo = :cardno")
	public Optional<CardDetails> updateCardType(@Param("cardno") int cardno,@Param("cardtype") String cardtype)
	{
		return readCard(cardno);
	}

}
