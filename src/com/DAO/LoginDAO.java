package com.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.LoanStaffVO;
import com.VO.LoginVO;

@Repository
public class LoginDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	public void insert(LoginVO loginVO)
	{
		try{
			Session session = this.sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(loginVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(LoginVO loginVO){
		
		Session Session = sessionFactory.openSession();
		Transaction transaction = Session.beginTransaction();
		
		Session.delete(loginVO);
		transaction.commit();
		Session.close();
	
}
	
}
