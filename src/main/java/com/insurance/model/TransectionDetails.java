package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "TransectionDetails")
public class TransectionDetails {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id;
	private int Transectionid;
	private int policyid;
	private String Amount;
	private String TransectionStatus;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getTransectionid() {
		return Transectionid;
	}
	public void setTransectionid(int transectionid) {
		Transectionid = transectionid;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getTransectionStatus() {
		return TransectionStatus;
	}
	public void setTransectionStatus(String transectionStatus) {
		TransectionStatus = transectionStatus;
	}
	
	

}
