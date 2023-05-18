package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="claim")
public class ClaimAdd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String claimStatus;
	private String claimAmount;
	private int userId;
	// Generate getter and setters

	public int getClaimId() {
		return Id;
	}

	public void setClaimId(int claimId) {
		this.Id = claimId;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + Id + ", claimStatus=" + claimStatus + ", claimAmount=" + claimAmount
				+ ", userId=" + userId + "]";
	}

	
	

}
