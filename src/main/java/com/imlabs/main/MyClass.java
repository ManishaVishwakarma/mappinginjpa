package com.imlabs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

import com.google.gson.Gson;
import com.imlabs.model.*;

public class MyClass {
	public static void main(String [] args){
		ApplicationContext context = new
				ClassPathXmlApplicationContext(
				"beans.xml");
				
		SessionFactory sessionFactory=(SessionFactory)context.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.getTransaction().commit();
		session.close();
			
	}

}
