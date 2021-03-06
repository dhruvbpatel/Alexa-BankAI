package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.LoanRateVO;
import com.VO.LoanTypeVO;

@Repository
public class LoanRateDAO {
	
	@Autowired
	SessionFactory sessionfactory;

	public void insert(LoanRateVO loanRateVO)
	{
		try{
			Session session = this.sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(loanRateVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List search(LoanRateVO loanRateVO) {
		// TODO Auto-generated method stub
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
		
		Query q = Session.createQuery("from LoanRateVO");
		List loanRateList = q.list();
		transaction.commit();
		
		return loanRateList;
	}
	

	public void delete(LoanRateVO loanRateVO){
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Session.delete(loanRateVO);
		
		transaction.commit();
		Session.close();
	}
	
	public List edit(LoanRateVO loanRateVO) {
		Session Session = sessionfactory.openSession();
		Query q = Session.createQuery("from LoanRateVO where id = " + loanRateVO.getId());
		List ls = q.list();
		Session.close();
		return ls;

	}
//	
//	public void delete(LoanTypeVO loanTypeVO){
//		Session Session = sessionfactory.openSession();
//		Transaction transaction = Session.beginTransaction();
//			
//		Session.delete(loanTypeVO);
//		
//		transaction.commit();
//		Session.close();
//	}
//
//
//	public List edit(LoanTypeVO loanTypeVO) {
//		Session Session = sessionfactory.openSession();
//		Transaction transaction = Session.beginTransaction();
//			
//		Query q = Session.createQuery("from LoanTypeVO where id = " + loanTypeVO.getId());
//		
//		List ls = q.list();
//	transaction.commit();
//		return ls;
//	}
//	
//	
	
}


