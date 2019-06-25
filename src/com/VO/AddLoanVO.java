package com.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="addloan_tbl")
public class AddLoanVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	
	@Column(name="LoanAmount")
	private String loanAmount;
	
	@Column(name="LoanDescription")
	private String loanDescription;
	
	@Column(name="PhotoName")
	private String photoName;
	
	@Column(name="PhotoPath")
	private String photoPath;
	
	@Column(name="status")
	private String status;
	
	@Column(name="ResidentialProofName")
	private String residentialProofName;
	
	@Column(name="ResidentialProofPath")
	private String residentialProofPath;
	
	@Column(name="PanCardName")
	private String panCardName;
	
	@Column(name="PanCardPath")
	private String panCardPath;
	
	@ManyToOne
	private LoginVO loginVO;
	
	@ManyToOne
	private LoanTypeVO loanTypeVO;

	@ManyToOne
	private LoanRateVO loanRateVO;
	
	
	
	public String getLoanDescription() {
		return loanDescription;
	}

	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getResidentialProofName() {
		return residentialProofName;
	}

	public void setResidentialProofName(String residentialProofName) {
		this.residentialProofName = residentialProofName;
	}

	public String getResidentialProofPath() {
		return residentialProofPath;
	}

	public void setResidentialProofPath(String residentialProofPath) {
		this.residentialProofPath = residentialProofPath;
	}

	public String getPanCardName() {
		return panCardName;
	}

	public void setPanCardName(String panCardName) {
		this.panCardName = panCardName;
	}

	public String getPanCardPath() {
		return panCardPath;
	}

	public void setPanCardPath(String panCardPath) {
		this.panCardPath = panCardPath;
	}

	public LoanRateVO getLoanRateVO() {
		return loanRateVO;
	}

	public void setLoanRateVO(LoanRateVO loanRateVO) {
		this.loanRateVO = loanRateVO;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}

	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
