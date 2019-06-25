package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.AddLoanVO;


@Repository
public class AddLoanDAO {
	
	@Autowired
	SessionFactory sessionfactory;

	public void insert(AddLoanVO addLoanVO)
	{
		try{
			Session session = this.sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(addLoanVO);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
public List search(){
		
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createQuery("from AddLoanVO");
		
		List ls=q.list();
		transaction.commit();
		Session.close();
			
		
		return ls;
	}

public List verifySearch(AddLoanVO addLoanVO){
	
	Session Session = sessionfactory.openSession();
	Transaction transaction = Session.beginTransaction();
		
	Query q = Session.createQuery("from AddLoanVO where id="+addLoanVO.getId());
	
	List ls=q.list();
	transaction.commit();
	Session.close();
		
	
	return ls;
}


}
