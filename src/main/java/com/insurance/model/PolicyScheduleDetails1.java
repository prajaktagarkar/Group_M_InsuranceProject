package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/*Task no.
 * 160. Design API to fetch policy schedule details from system.
 * @author : Parmeshwar Manjare 
 */


@Entity
@Table(name = "PolicyScheduleDetails")
public class PolicyScheduleDetails1 {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	private String PolicyName;
	private String PlanName;
	private String UserName;
	private String PremiumAmount;
	public String getPolicyName() {
		return PolicyName;
	}
	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPremiumAmount() {
		return PremiumAmount;
	}
	public void setPremiumAmount(String premiumAmount) {
		PremiumAmount = premiumAmount;
	}
	

}
