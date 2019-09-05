package com.example.hibernate.helloworld;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMainClass {

	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = new Configuration().configure().buildSessionFactory();
		Date date = new Date(System.currentTimeMillis());
		StudentClient stud= new StudentClient();
		//StudentAnno studAnno= new StudentAnno();
		
		stud.setSTUD_NAME("Jim");
		stud.setSTUD_MARKS(93);
		stud.setSTUD_JOIN_DATE(date);
		
		Session session = factory.openSession();
		session.save(stud);
		session.close();

	}

}
