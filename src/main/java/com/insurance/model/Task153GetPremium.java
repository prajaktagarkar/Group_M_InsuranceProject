package com.insurance.model;
/*Task 153
 * API Get All premium details
@authhor Prajakta Garkar

 */
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="premium")
public class Task153GetPremium {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String premiumId;
	private String policyHolderName;
	private String installmentPremiumAmount;
	private Date commencementDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
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
	@Override
	public String toString() {
		return "Task153GetPremium [id=" + id + ", premiumId=" + premiumId + ", policyHolderName=" + policyHolderName
				+ ", installmentPremiumAmount=" + installmentPremiumAmount + ", commencementDate=" + commencementDate
				+ "]";
	}
	

}
