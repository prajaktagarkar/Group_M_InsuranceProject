package com.insurance.model;
/*
 * Task148 Delete Cliam
 * @Author Prajakta Garkar
 */
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "claim")
public class Task148DeleteClaim {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String claimStatus;
	private String claimAmount;
	

	// Generate getter and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	
}
