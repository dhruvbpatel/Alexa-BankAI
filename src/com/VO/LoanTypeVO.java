package com.VO;

import javax.persistence.*;

@Entity
@Table(name="LoanType_tbl")
public class LoanTypeVO {
	
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="LoanType")
	private String loanType;
	
	@Column(name="LoanTypeDescription")
	private String loanTypeDescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanTypeDescription() {
		return loanTypeDescription;
	}

	public void setLoanTypeDescription(String loanTypeDescription) {
		this.loanTypeDescription = loanTypeDescription;
	}


}
