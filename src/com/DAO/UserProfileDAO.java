package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.LoginVO;
import com.VO.UserProfileVO;

@Repository
public class UserProfileDAO {
	
	@Autowired
	SessionFactory sessionfactory;

	public void insert(UserProfileVO userProfileVO)
	{
		try{
			Session session = this.sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(userProfileVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List search(){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from UserProfileVO");
		
		List ls=q.list();
		transaction.commit();
		Session.close();
			
		
		return ls;
	}

	
	public List findByLoginId(LoginVO loginVO){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from UserProfileVO where loginVO.id = " + loginVO.getId());
		
		List ls=q.list();
		transaction.commit();
		Session.close();
			
		
		return ls;
	}

	
}
