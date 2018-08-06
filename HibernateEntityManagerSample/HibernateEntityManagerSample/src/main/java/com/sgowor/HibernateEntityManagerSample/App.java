package com.sgowor.HibernateEntityManagerSample;

import javax.persistence.EntityManager;

import com.sgowor.HibernateEntityManagerSample.core.DbConfigurator;
import com.sgowor.HibernateEntityManagerSample.model.Car;

public class App {
	public static void main(String[] args) {
		EntityManager em = DbConfigurator.getEntityManager();
		Car myCar = new Car();
		myCar.setMark("Ford");
		myCar.setModel("Focus");

		em.getTransaction().begin();
		em.persist(myCar);
		em.getTransaction().commit();
	}
}
