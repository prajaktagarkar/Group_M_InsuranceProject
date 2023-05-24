package com.insurance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task no.
 * 143.Delete policy details.
 * @author : Parmeshwar Manjare
 */


@Entity
@Table(name =" PolicyDetails")
public class PolicyDetails2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int policyid;
	private String policyNumber;
	private Date PolicyEffectiveDate;
	private Date policyExpiryDate;
	private String PaymentOption;
	private Double TotalAmount;
	private String Status;
	private Date CreatedDate;
	private String AdditionalInfo;
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Date getPolicyEffectiveDate() {
		return PolicyEffectiveDate;
	}
	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		PolicyEffectiveDate = policyEffectiveDate;
	}
	public Date getPolicyExpiryDate() {
		return policyExpiryDate;
	}
	public void setPolicyExpiryDate(Date policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}
	public String getPaymentOption() {
		return PaymentOption;
	}
	public void setPaymentOption(String paymentOption) {
		PaymentOption = paymentOption;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
	public String getAdditionalInfo() {
		return AdditionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		AdditionalInfo = additionalInfo;
	}
	

}
