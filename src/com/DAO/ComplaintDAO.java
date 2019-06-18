package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.ComplaintVO;
import com.VO.LoanTypeVO;


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
			
		Query q = Session.createQuery("from ComplaintVO");
		
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
	
	
}
