package com.insurance.model;
/*
 * task no.154 design the API update premium details into database
 * @author swati
 */
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "premiumdetails")
public class PremiumDetailsUpdate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int premiumId;
	private int policyId;
	private String policyHolderName;
	private int installmentPremiumAmount;
	private Date policyCommencementDate;
	@OneToMany(mappedBy = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public int getInstallmentPremiumAmount() {
		return installmentPremiumAmount;
	}
	public void setInstallmentPremiumAmount(int installmentPremiumAmount) {
		this.installmentPremiumAmount = installmentPremiumAmount;
	}
	public Date getPolicyCommencementDate() {
		return policyCommencementDate;
	}
	public void setPolicyCommencementDate(Date policyCommencementDate) {
		this.policyCommencementDate = policyCommencementDate;
	}

}
