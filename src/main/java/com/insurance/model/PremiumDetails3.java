package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Task no.
 * 152.Design API to save all the premium details into database.
 * @author : Parmeshwar Manjare.
 */



@Entity
@Table(name = "PremiumDetails")
public class PremiumDetails3 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int policyid;
	private String PolicyHolderName;
	private String InstallmentPremiumAmount;
	private String PolicyCommencementDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getPolicyHolderName() {
		return PolicyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		PolicyHolderName = policyHolderName;
	}
	public String getInstallmentPremiumAmount() {
		return InstallmentPremiumAmount;
	}
	public void setInstallmentPremiumAmount(String installmentPremiumAmount) {
		InstallmentPremiumAmount = installmentPremiumAmount;
	}
	public String getPolicyCommencementDate() {
		return PolicyCommencementDate;
	}
	public void setPolicyCommencementDate(String policyCommencementDate) {
		PolicyCommencementDate = policyCommencementDate;
	}
	public PremiumDetails3(int id, int premiumid, int policyid, String policyHolderName, String installmentPremiumAmount,
			String policyCommencementDate) {
		super();
		this.id = id;
		
		this.policyid = policyid;
		PolicyHolderName = policyHolderName;
		InstallmentPremiumAmount = installmentPremiumAmount;
		PolicyCommencementDate = policyCommencementDate;
	}
	@Override
	public String toString() {
		return "PremiumDetails [id=" + id + ", premiumid=" + ", policyid=" + policyid
				+ ", PolicyHolderName=" + PolicyHolderName + ", InstallmentPremiumAmount=" + InstallmentPremiumAmount
				+ ", PolicyCommencementDate=" + PolicyCommencementDate + "]";
	}
	
	
	
}
