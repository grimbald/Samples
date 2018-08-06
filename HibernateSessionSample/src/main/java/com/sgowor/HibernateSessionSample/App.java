package com.sgowor.HibernateSessionSample;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sgowor.HibernateSessionSample.core.HibernateConfigurator;
import com.sgowor.HibernateSessionSample.model.Author;
import com.sgowor.HibernateSessionSample.model.Book;

public class App {
	public static void main(String[] args) {
		Author firstAuthor = new Author();
		firstAuthor.setName("Gal Anonymous");

		Book firstBook = new Book();
		firstBook.setTitle("The first of books");
		firstBook.setAuthor(firstAuthor);
		firstBook.setCreationTime(new Date());

		Book secondBook = new Book();
		secondBook.setTitle("The second book");
		secondBook.setAuthor(firstAuthor);

		SessionFactory sessionFactory = HibernateConfigurator.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(firstAuthor);
		session.saveOrUpdate(firstBook);
		session.saveOrUpdate(secondBook);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
