package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

//156: Design API to store user with multiple premium details into database.
@Entity
@Table(name = "policypremiumdetails")
public class PolicyPremiumDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Premiumid;
	private String Policyid;
	private String Policyholdername;
	private String Installmentpremiumamount;
	private String Policycommencementdate;
	private int userId;

//Generate getter and Setter
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPremiumid() {
		return Premiumid;
	}

	public void setPremiumid(String premiumid) {
		Premiumid = premiumid;
	}

	public String getPolicyid() {
		return Policyid;
	}

	public void setPolicyid(String policyid) {
		Policyid = policyid;
	}

	public String getPolicyholdername() {
		return Policyholdername;
	}

	public void setPolicyholdername(String policyholdername) {
		Policyholdername = policyholdername;
	}

	public String getInstallmentpremiumamount() {
		return Installmentpremiumamount;
	}

	public void setInstallmentpremiumamount(String installmentpremiumamount) {
		Installmentpremiumamount = installmentpremiumamount;
	}

	public String getPolicycommencementdate() {
		return Policycommencementdate;
	}

	public void setPolicycommencementdate(String policycommencementdate) {
		Policycommencementdate = policycommencementdate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PolicyPremiumDetails [Id=" + Id + ", Premiumid=" + Premiumid + ", Policyid=" + Policyid
				+ ", Policyholdername=" + Policyholdername + ", Installmentpremiumamount=" + Installmentpremiumamount
				+ ", Policycommencementdate=" + Policycommencementdate + ", userId=" + userId + "]";
	}
	

}
