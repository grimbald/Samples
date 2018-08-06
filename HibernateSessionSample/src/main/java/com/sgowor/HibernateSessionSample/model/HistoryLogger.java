package com.sgowor.HibernateSessionSample.model;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@MappedSuperclass
public class HistoryLogger {
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
}
