package com.restapi.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//Table structure

@Entity
@Table (name = "CardDetails")
public class CardDetails {
	
	@Id
	@Column(name="cardNo")
	private int cardNo;
	
	@Column(name="cardType")
	private String cardType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="cardExpiry")
	private Date cardExpiry;
	
	//each customer has one card---so it has one-to-one mapping
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardholderId",referencedColumnName = "accid")
	private CustomerDetails cardholderId;        //foreign-key
	
	public CardDetails() {}
	
	public CardDetails(int cardNo, String cardType, Date cardExpiry, CustomerDetails cardholderId) {
		super();
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.cardExpiry = cardExpiry;
		this.cardholderId = cardholderId;
	}
	
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
	public CustomerDetails getCardholderId() {
		return cardholderId;
	}
	public void setCardholderId(CustomerDetails cardholderId) {
		this.cardholderId = cardholderId;
	}
	

}
