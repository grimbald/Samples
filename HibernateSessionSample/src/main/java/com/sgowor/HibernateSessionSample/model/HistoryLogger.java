package com.sgowor.HibernateSessionSample.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class HistoryLogger {
	@Temporal(TemporalType.TIMESTAMP)
	// @Generated(GenerationTime.INSERT)
	// @Column(name = "creationTime", insertable = false)
	private Date creationTime;

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
}
