package com.sgowor.HibernateEntityManagerSample;

import javax.persistence.EntityManager;

import com.sgowor.HibernateEntityManagerSample.core.DbConfigurator;
import com.sgowor.HibernateEntityManagerSample.model.Car;
import com.sgowor.HibernateEntityManagerSample.model.RandomId;

public class App {
	public static void main(String[] args) {
		EntityManager em = DbConfigurator.getEntityManager();
		Car myCar = new Car();
		myCar.setMark("Ford");
		myCar.setModel("Focus");

		em.getTransaction().begin();
		em.persist(myCar);
		em.persist(new RandomId());
		em.getTransaction().commit();
	}
}
