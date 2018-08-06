package com.sgowor.HibernateEntityManagerSample.model;

//@Entity
//@Table
public class Car {
	// @Id
	// @GeneratedValue
	private Integer id;
	private String mark;
	private String model;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
