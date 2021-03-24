package com.cg.hbm.entites;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BookingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int booking_id;
	private int room_id;
	private int user_id;
	private Date booked_from;
	private Date booked_to;
	private int no_of_adults;
	private int no_of_children;
	private double amount;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName="user_id",insertable=false ,updatable=false)
    private User user;
    
    
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel_id",referencedColumnName="hotel_id",insertable=false ,updatable=false)
	private Hotel hotel;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="room_id",referencedColumnName="room_id",insertable=false ,updatable=false)
	private RoomDetails Room;
	
	
	
	
	
	public BookingDetails() {
		
	}
	public BookingDetails(int booking_id,int room_id, int user_id, Date booked_from, Date booked_to,
			int no_of_adults, int no_of_children, double amount,User user) {
		super();
		this.booking_id = booking_id;
		this.room_id = room_id;
		this.user_id = user_id;
		this.booked_from = booked_from;
		this.booked_to = booked_to;
		this.no_of_adults = no_of_adults;
		this.no_of_children = no_of_children;
		this.amount = amount;
		this.user=user;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getBooked_from() {
		return booked_from;
	}
	public void setBooked_from(Date booked_from) {
		this.booked_from = booked_from;
	}
	public Date getBooked_to() {
		return booked_to;
	}
	public void setBooked_to(Date booked_to) {
		this.booked_to = booked_to;
	}
	public int getNo_of_adults() {
		return no_of_adults;
	}
	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}
	public int getNo_of_children() {
		return no_of_children;
	}
	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}