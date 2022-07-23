package com.restapi.model;

import java.sql.Date;

public class CardDetailsHelper {
	private int cardNo;	
	private String cardType;
	private Date cardExpiry;
	private int cardholderId;
	
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Date getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(Date cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public int getCardholderId() {
		return cardholderId;
	}
	public void setCardholderId(int cardholderId) {
		this.cardholderId = cardholderId;
	}
}
