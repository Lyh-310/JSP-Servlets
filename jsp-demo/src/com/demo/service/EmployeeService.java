package com.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeService {
	
	//Connection con;
	SessionFactory factory;
	
	public EmployeeService() {
		try {
			Configuration config = new AnnotationConfiguration().configure();
			factory = config.buildSessionFactory();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int insert(Employee emp) {
		try {
			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			session.save(emp);
			tran.commit();
			session.close();
			return 1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
