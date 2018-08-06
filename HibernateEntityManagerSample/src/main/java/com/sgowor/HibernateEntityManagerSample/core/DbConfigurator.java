package com.sgowor.HibernateEntityManagerSample.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DbConfigurator {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
