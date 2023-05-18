package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Product Backlog Item 159: Design API to update policy schedule details into database.

@Entity
@Table(name="policyscheduledetails")
public class PolicyScheduleDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String policyName;
private String planName;
private String userName;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPolicyName() {
	return policyName;
}
public void setPolicyName(String policyName) {
	this.policyName = policyName;
}
public String getPlanName() {
	return planName;
}
public void setPlanName(String planName) {
	this.planName = planName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

}
