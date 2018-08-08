package com.sgowor.HibernateEntityManagerSample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class RandomId {
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "com.sgowor.HibernateEntityManagerSample.model.MyGenerator")
	@GeneratedValue(generator = "myGenerator")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
