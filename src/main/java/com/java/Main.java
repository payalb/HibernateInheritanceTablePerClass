package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.java.dto.Employee;
import com.java.dto.Manager;
import com.java.dto.Person;

public class Main {
	static SessionFactory sf;
	static {
		Configuration cfg = new Configuration().addPackage("com.java.dto");
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}

	public static void main(String args[]) {
		Main obj = new Main();
		try {
			saveData();
			
		} finally {
			sf.close();
		}

	}

	private static void saveData() {
		Person p= new Person( "Payal");
		Employee e1= new Employee("Ritu",6745, "RJT");
		Manager m1= new Manager("Shikha", 46564, "RJT", 67435463.43f, "Training");
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(p);
		s.save(e1);
		s.save(m1);
		t.commit();
		s.close();
	}

	
}
