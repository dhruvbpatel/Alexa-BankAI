package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.ComplaintVO;
import com.VO.FeedbackVO;

@Repository
public class FeedbackDAO {
	@Autowired
	SessionFactory sessionfactory;

	public List search() {
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from FeedbackVO ");
		
		List ls=q.list();
		transaction.commit();
		Session.close();
		return ls;
	}
	
	public void insert(FeedbackVO feedbackVO)
	{
		try{
			Session session = this.sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(feedbackVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
