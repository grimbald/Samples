package com.sgowor.HibernateEntityManagerSample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import com.sgowor.HibernateEntityManagerSample.core.DbConfigurator;
import com.sgowor.HibernateEntityManagerSample.model.Car;
import com.sgowor.HibernateEntityManagerSample.model.RandomId;

public class App {
	public static void main(String[] args) {
		EntityManager em = DbConfigurator.getEntityManager();
		Car myCar = new Car();
		myCar.setMark("Ford");
		myCar.setModel("Focus");

		try {
			em.getTransaction().begin();
			em.persist(myCar);
			em.persist(new RandomId());

			CriteriaQuery<Car> query = em.getCriteriaBuilder().createQuery(Car.class);
			query.from(Car.class);
			List<Car> cars = em.createQuery(query).getResultList();

			System.out.println();
			cars.stream().forEach((car) -> System.out.println(car.getMark() + " " + car.getModel()));
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.getTransaction().commit();
		}
	}
}
