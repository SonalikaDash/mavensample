package com.ocac.DAO;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ocac.model.Register;


@Transactional

public class RegisterDAOImpl implements RegisterDAO{

		
		@Autowired
		private SessionFactory sessionFactory;
		

		@Override
		
		public List<Register> getAll() {				
			return sessionFactory.getCurrentSession().createQuery("FROM Register").list();
		}

		@Override
	
		public void insert(Register r) {
			sessionFactory.getCurrentSession().persist(r);
			
		}

		@Override
		
		public void update(Register r) {
			
			sessionFactory.getCurrentSession().update(r);
			
		}

		@Override
		
		public void delete(int id) {
		
			 sessionFactory.getCurrentSession().delete(getId(id));
		}

		
		@Override
		
		public Register getId(int id) {
			return sessionFactory.getCurrentSession().get(Register.class, id);
		}

}