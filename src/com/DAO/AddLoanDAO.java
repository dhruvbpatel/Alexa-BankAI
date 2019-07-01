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

import com.VO.AddLoanVO;
import com.VO.LoginVO;


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


public List approvedLoanCount() {
	// TODO Auto-generated method stub
	List ls = new ArrayList();
	try {
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
			
		Query q = Session.createSQLQuery("SELECT COUNT(Id) FROM `addloan_tbl` WHERE STATUS='APPROVED'");
		
		ls=q.list();
		transaction.commit();
		Session.close();
	
	}catch (HibernateException hb) {

		hb.printStackTrace();
	}
	
	return ls;
}


public List approvedStaffLoanCount(LoginVO loginVO) {
	// TODO Auto-generated method stub
	List ls = new ArrayList();
	try {
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
		System.out.println("Session.createSQLQuery('SELECT COUNT(Id) FROM AddLoanVO WHERE  STATUS='APPROVED' AND loginVO='+loginVO.getId())");	
		Query q = Session.createSQLQuery("SELECT COUNT(Id) FROM addloan_tbl WHERE  STATUS='APPROVED' AND loginVO_Id="+loginVO.getId());
		
		ls=q.list();
		transaction.commit();
		Session.close();
	
	}catch (HibernateException hb) {

		hb.printStackTrace();
	}
	
	return ls;

}


public List graph() {
	// TODO Auto-generated method stub

	List ls = new ArrayList();
	try {
		Session Session = sessionfactory.openSession();
		Transaction transaction = Session.beginTransaction();
		System.out.println("Session.createSQLQuery('SELECT COUNT(Id),`loginVO_Id` FROM `addloan_tbl`  GROUP BY `loginVO_Id`'')");	
		
		Query q = Session.createSQLQuery("SELECT COUNT(a.Id),email FROM `addloan_tbl` AS a INNER JOIN login_tbl AS l  ON a.loginVO_Id=l.Id   GROUP BY loginVO_Id");
		
		/*Query q = Session.createSQLQuery("SELECT COUNT(Id),`loginVO_Id` FROM `addloan_tbl`  GROUP BY `loginVO_Id`");*/
		
		ls=q.list();
		transaction.commit();
		Session.close();
	
	}catch (HibernateException hb) {

		hb.printStackTrace();
	}
	
	return ls;
	
	
}


public List searchOwnLoan(LoginVO loginVO){
	
	Session Session = sessionfactory.openSession();
	Transaction transaction = Session.beginTransaction();
		
	Query q = Session.createQuery("from AddLoanVO where loginVO="+loginVO.getId());
	
	List ls=q.list();
	transaction.commit();
	Session.close();
		
	
	return ls;
}




}
