package com.VO;

import javax.persistence.*;

@Entity
@Table(name="Complaint_tbl")
public class ComplaintVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	
	@Column(name="ComplaintSubject")
	private String complaintSubject;
	
	@Column(name="ComplaintDescrption")
	private String complaintDescrption;
	
	@Column(name="ComplaintDate")
	private String complaintDate;
	
	@Column(name="Reply")
	private String reply;
	
	@Column(name="ReplyDate")
	private String replyDate;
	
	@Column(name="Status")
	private String status;
	
	@ManyToOne
	private LoginVO loginVO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComplaintSubject() {
		return complaintSubject;
	}

	public void setComplaintSubject(String complaintSubject) {
		this.complaintSubject = complaintSubject;
	}

	public String getComplaintDescrption() {
		return complaintDescrption;
	}

	public void setComplaintDescrption(String complaintDescrption) {
		this.complaintDescrption = complaintDescrption;
	}

	public String getComplaintDate() {
		return complaintDate;
	}

	public void setComplaintDate(String complaintDate) {
		this.complaintDate = complaintDate;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LoginVO getLoginVO() {
		return loginVO;
	}

	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}
	
	
	
	
	
}
