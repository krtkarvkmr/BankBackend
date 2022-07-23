package com.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerDetails")
public class CustomerDetails {
	
	@Id
	@Column(name="accid")
	private int accid;
	@Column(name="custname")
	private String custname;
	@Column(name="accountType")
	private String accountType;
	@Column(name="balanceAmount")
	private int balanceAmount;
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

}
