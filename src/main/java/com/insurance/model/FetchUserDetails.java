package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Task no
 * 137.Fetch the User Details.
 * @author parmeshwar manjare
 */


@Entity
@Table(name = "userdetails")
public class FetchUserDetails {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int  id;
	private String policyId;
	private String firstname;
	private String lastname;
	private String DOB;
	private String EmailAddress;
	private String MobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

}
