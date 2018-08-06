package com.sgowor.HibernateEntityManagerSample.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGenerator implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return (new Date()).getTime();
	}

}
