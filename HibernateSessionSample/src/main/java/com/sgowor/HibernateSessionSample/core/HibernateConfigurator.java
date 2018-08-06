package com.sgowor.HibernateSessionSample.core;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sgowor.HibernateSessionSample.model.Author;
import com.sgowor.HibernateSessionSample.model.Book;

public abstract class HibernateConfigurator {

	private static Configuration configuration = new Configuration().configure();

	static {
		configuration.addAnnotatedClass(Author.class);
		configuration.addAnnotatedClass(Book.class);
	}

	public static SessionFactory getSessionFactory() {
		return configuration.buildSessionFactory();
	}
}