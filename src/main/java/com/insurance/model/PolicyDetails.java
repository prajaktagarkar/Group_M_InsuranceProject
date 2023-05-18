package com.insurance.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policydetails")
public class PolicyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int policyid;
private String policyNo;
private Date policyEffectiveNo;
private Date policyexpiryDate;
private String paymentOption;
private int totalAmount;
private String status;
private Date createdDate;
private String additionalInfo;
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
public String getPolicyNo() {
	return policyNo;
}
public void setPolicyNo(String policyNo) {
	this.policyNo = policyNo;
}
public Date getPolicyEffectiveNo() {
	return policyEffectiveNo;
}
public void setPolicyEffectiveNo(Date policyEffectiveNo) {
	this.policyEffectiveNo = policyEffectiveNo;
}
public Date getPolicyexpiryDate() {
	return policyexpiryDate;
}
public void setPolicyexpiryDate(Date policyexpiryDate) {
	this.policyexpiryDate = policyexpiryDate;
}
public String getPaymentOption() {
	return paymentOption;
}
public void setPaymentOption(String paymentOption) {
	this.paymentOption = paymentOption;
}
public int getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public String getAdditionalInfo() {
	return additionalInfo;
}
public void setAdditionalInfo(String additionalInfo) {
	this.additionalInfo = additionalInfo;
}



}
