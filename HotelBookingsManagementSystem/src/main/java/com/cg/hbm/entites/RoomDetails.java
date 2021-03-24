package com.cg.hbm.entites;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="room_details")
public class RoomDetails {
	@Id
	private int room_id;
	private int hotel_id;
	private String room_no;
	private String room_type;
	private double rate_per_day;
	private boolean isAvailable;
	private Blob photo;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel_id",referencedColumnName="hotel_id",insertable=false ,updatable=false)
	private Hotel hotel;
	
	public RoomDetails() {
		super();
	}
	
	public RoomDetails(int room_id, int hotel_id, String room_no, String room_type, double rate_per_day,
			Boolean isavailable) {
		super();
		this.room_id = room_id;
		this.hotel_id = hotel_id;
		this.room_no = room_no;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isAvailable = isavailable;
	}
	
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getRoom_no() {
		return room_no;
	}
	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public double getRate_per_day() {
		return rate_per_day;
	}
	public void setRate_per_day(double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	
	
}
