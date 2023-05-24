package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task no.
 * 155. Design API to delete premium details from database.
 * @author : Parmeshwar Manjare
 */

@Entity
@Table(name = "deletepremiumdetails")
public class DeletePremiumDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int premiumid;
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
public int getPremiumid() {
	return premiumid;
}
public void setPremiumid(int premiumid) {
	this.premiumid = premiumid;
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
@Override
public String toString() {
	return "DeletePremiumDetails [id=" + id + ", premiumid=" + premiumid + ", policyid=" + policyid
			+ ", PolicyHolderName=" + PolicyHolderName + ", InstallmentPremiumAmount=" + InstallmentPremiumAmount
			+ ", PolicyCommencementDate=" + PolicyCommencementDate + "]";
}

}
