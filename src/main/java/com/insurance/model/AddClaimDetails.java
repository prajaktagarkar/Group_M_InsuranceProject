package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="claimdetails")
public class AddClaimDetails {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id;
	private int	claimId;
	private String policyId;
	private String claimStatus;
	private String claimAmount;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public String getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}
	@Override
	public String toString() {
		return "AddClaimDetails [Id=" + Id + ", claimId=" + claimId + ", policyId=" + policyId + ", claimStatus="
				+ claimStatus + ", claimAmount=" + claimAmount + ", getId()=" + getId() + ", getClaimId()="
				+ getClaimId() + ", getPolicyId()=" + getPolicyId() + ", getClaimStatus()=" + getClaimStatus()
				+ ", getClaimAmount()=" + getClaimAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
