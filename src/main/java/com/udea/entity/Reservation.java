package com.udea.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private String reservationName;

	public Reservation(String reservationName) {
		super();
		this.reservationName = reservationName;
	}
	
   public Reservation() {
		super();
	}

public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReservationName() {
		return reservationName;
	}
	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}
	
}
