package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.LoanStaffVO;
import com.VO.LoanTypeVO;

@Repository
public class LoanStaffDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void insert(LoanStaffVO loanStaffVO)
	{
		try{
			Session session = this.sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(loanStaffVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List search(){
		
		Session Session = sessionFactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from LoanStaffVO");
		
		List ls=q.list();
		transaction.commit();
		Session.close();
			
		
		return ls;
	}
	
	
	public void delete(LoanStaffVO loanStaffVO){
		
		Session Session = sessionFactory.openSession();
		Transaction transaction = Session.beginTransaction();
		
		Session.delete(loanStaffVO);
		transaction.commit();
		Session.close();
	
}
	
	
	
}
