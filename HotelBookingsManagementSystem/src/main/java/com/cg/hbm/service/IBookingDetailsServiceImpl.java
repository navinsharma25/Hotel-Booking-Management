package com.cg.hbm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.dao.IBookingDetailsRepository;
import com.cg.hbm.entites.BookingDetails;

@Service
public class IBookingDetailsServiceImpl implements IBookingDetailsService {

	
	@Autowired
	IBookingDetailsRepository bDao;
	
	@Override
	public List<BookingDetails> addBookingDetails(BookingDetails bookingdetails) {
		
		bDao.save(bookingdetails);
		return bDao.findAll();
	}

	@Override
	public List<BookingDetails> updateBookingDetails(BookingDetails bookingdetails) {
		
		bDao.save(bookingdetails);
		return bDao.findAll();
	}

	@Override
	public List<BookingDetails> showAllBookingDetails() {
		
		return bDao.findAll();
	}

	@Override
	public BookingDetails showBookingDetails(int id) {
		
		if(bDao.findById(id).isPresent()) {
			return bDao.findById(id).get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<BookingDetails> removeBookingDetails(int id) {
		
		 bDao.deleteById(id);
		 return bDao.findAll();
	}
}
