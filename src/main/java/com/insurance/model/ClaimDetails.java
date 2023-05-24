package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task no.
 * 146.Build the Restful WebService to Update claim details.
 * @author : Parmeshwar Manjare
 */


@Entity
@Table(name ="ClaimDetails")
public class ClaimDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id;
	private int Claimid;
	private String policyid;
	private String ClaimStatus;
	private String ClaimAmount;
	private int userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClaimid() {
		return Claimid;
	}
	public void setClaimid(int claimid) {
		Claimid = claimid;
	}
	public String getPolicyid() {
		return policyid;
	}
	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}
	public String getClaimStatus() {
		return ClaimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		ClaimStatus = claimStatus;
	}
	public String getClaimAmount() {
		return ClaimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		ClaimAmount = claimAmount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "ClaimDetails [id=" + id + ", Claimid=" + Claimid + ", policyid=" + policyid + ", ClaimStatus="
				+ ClaimStatus + ", ClaimAmount=" + ClaimAmount + ", getId()=" + getId() + ", getClaimid()="
				+ getClaimid() + ", getPolicyid()=" + getPolicyid() + ", getClaimStatus()=" + getClaimStatus()
				+ ", getClaimAmount()=" + getClaimAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
