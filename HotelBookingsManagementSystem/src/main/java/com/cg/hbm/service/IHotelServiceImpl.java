package com.cg.hbm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.dao.IHotelRepository;
import com.cg.hbm.entites.Hotel;
import com.google.common.base.Optional;

@Service
@Transactional
public class IHotelServiceImpl implements IHotelService {

	@Autowired
	IHotelRepository hDao;
	
	
	@Override
	public List<Hotel> addHotel(Hotel hotel) {
		hDao.save(hotel);	
		return hDao.findAll();
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		hDao.save(hotel);
		return hotel;
	}

	@Override
	public List<Hotel> removeHotel(int hotel_id) {
		hDao.deleteById(hotel_id);
		return hDao.findAll();
	}

	@Override
	public List<Hotel> showAllHotels() {
		return hDao.findAll();
	}

	@Override
	public Hotel showHotel(int hotel_id) {
		if(hDao.findById(hotel_id).isPresent()) {
			return hDao.findById(hotel_id).get();
		}
		else {
			return null;
		}
	
	}
	

}
