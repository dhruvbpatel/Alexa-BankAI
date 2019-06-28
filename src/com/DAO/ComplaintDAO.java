package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.ComplaintVO;
import com.VO.LoanTypeVO;
import com.VO.LoginVO;


@Repository
public class ComplaintDAO {
	
	@Autowired
	SessionFactory sessionfactory;

	public void insert(ComplaintVO complaintVO)
	{
		try{
			Session session = this.sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(complaintVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List search(){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from ComplaintVO where loginVO.role='ROLE_STAFF'");
		
		List ls=q.list();
		transaction.commit();
		Session.close();
		return ls;
	}
	
	public List searchOwnComplain(LoginVO loginVO){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from ComplaintVO where loginVO.id="+loginVO.getId());
		
		List ls=q.list();
		transaction.commit();
		Session.close();
		return ls;
	}
	
	public void delete(ComplaintVO complaintVO){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
		
		Session.delete(complaintVO);
		transaction.commit();
		Session.close();
	
}
	
	public List edit(ComplaintVO complaintVO) {
		Session Session = sessionfactory.openSession();
		Query q = Session.createQuery("from ComplaintVO where id = " + complaintVO.getId());
		List ls=q.list();
		Session.close();
		return ls;
	}
	
public List searchUserComplaint(){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from ComplaintVO where loginVO.role='ROLE_USER'");
		
		List ls=q.list();
		transaction.commit();
		Session.close();
		return ls;
	}


public List complainCount() {
	
	List ls = new ArrayList();
	try {
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createSQLQuery("SELECT COUNT(Id) FROM complaint_tbl");
		
		ls=q.list();
		transaction.commit();
		Session.close();
	
	}catch (HibernateException hb) {

		hb.printStackTrace();
	}
	
	return ls;
}


public List pendingLoanCount() {
	// TODO Auto-generated method stub
	List ls = new ArrayList();
	try {
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createSQLQuery("SELECT COUNT(Id) FROM `complaint_tbl` WHERE STATUS='PENDING';");
		
		ls=q.list();
		transaction.commit();
		Session.close();
	
	}catch (HibernateException hb) {

		hb.printStackTrace();
	}
	
	return ls;
}
	
}
