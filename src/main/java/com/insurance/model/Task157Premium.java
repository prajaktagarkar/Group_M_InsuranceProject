package com.insurance.model;
/*
 * Task157 Get User with multiple premium details

 * @Author Prajakta Garkar
 */
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="premium")
public class Task157Premium {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String premiumID;
	private String policyHolderName;
	private String installmentPremiumAmount;
	private Date commencementDate;
	private int userid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPremiumId() {
		return premiumID;
	}
	public void setPremiumId(String premiumId) {
		this.premiumID = premiumId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getInstallmentPremiumAmount() {
		return installmentPremiumAmount;
	}
	public void setInstallmentPremiumAmount(String installmentPremiumAmount) {
		this.installmentPremiumAmount = installmentPremiumAmount;
	}
	public Date getCommencementDate() {
		return commencementDate;
	}
	public void setCommencementDate(Date commencementDate) {
		this.commencementDate = commencementDate;
	}
	
public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
	}
	@Override
	public String toString() {
		return "Task157Premium [id=" + id + ", premiumID=" + premiumID + ", policyHolderName=" + policyHolderName
				+ ", installmentPremiumAmount=" + installmentPremiumAmount + ", commencementDate=" + commencementDate
				+ ", userid=" + userid + "]";
	}
	
	

}
