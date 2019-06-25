package com.VO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LoanRate_tbl")
public class LoanRateVO implements Serializable {

	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="loanRate")
	private int loanRate;
	
	@Column(name="loanRateDescription")
	private String loanRateDescription;
	
	@ManyToOne
	private LoanTypeVO loanTypeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLoanRate() {
		return loanRate;
	}

	public void setLoanRate(int loanRate) {
		this.loanRate = loanRate;
	}

	public String getLoanRateDescription() {
		return loanRateDescription;
	}

	public void setLoanRateDescription(String loanRateDescription) {
		this.loanRateDescription = loanRateDescription;
	}

	public LoanTypeVO getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(LoanTypeVO loanTypeId) {
		this.loanTypeId = loanTypeId;
	}


	

	
	
	}
	
