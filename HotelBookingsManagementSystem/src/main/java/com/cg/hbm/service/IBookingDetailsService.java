package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.BookingDetails;

public interface IBookingDetailsService {
	public List<BookingDetails> addBookingDetails(BookingDetails bookingdetails);
	public List<BookingDetails> updateBookingDetails(BookingDetails bookingdetails);
	public List<BookingDetails> showAllBookingDetails();
	public List<BookingDetails> removeBookingDetails(int id);
	public BookingDetails showBookingDetails(int id);
}
