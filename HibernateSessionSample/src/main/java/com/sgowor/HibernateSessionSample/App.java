package com.sgowor.HibernateSessionSample;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sgowor.HibernateSessionSample.core.HibernateConfigurator;
import com.sgowor.HibernateSessionSample.model.Author;
import com.sgowor.HibernateSessionSample.model.Book;

public class App {
	private static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		Author firstAuthor = new Author();
		firstAuthor.setName("Gal Anonymous");

		Book firstBook = new Book();
		firstBook.setTitle("The first of books");
		firstBook.setAuthor(firstAuthor);

		Book secondBook = new Book();
		secondBook.setTitle("The second book");
		secondBook.setAuthor(firstAuthor);

		SessionFactory sessionFactory = HibernateConfigurator.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(firstAuthor);
		session.saveOrUpdate(firstBook);
		session.saveOrUpdate(secondBook);

		CriteriaQuery<Book> criteriaQuery = session.getCriteriaBuilder().createQuery(Book.class);
		criteriaQuery.from(Book.class);
		List<Book> books = session.createQuery(criteriaQuery).getResultList();
		books.stream().forEach((a) -> System.out.println(a.getTitle()));

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		LOGGER.debug("End");
	}
}
