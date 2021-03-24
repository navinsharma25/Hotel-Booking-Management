package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.Hotel;

public interface IHotelService {
	public List<Hotel> addHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public List<Hotel> removeHotel(int hotel_id);
	public List<Hotel> showAllHotels();
	public Hotel showHotel(int id);
}
