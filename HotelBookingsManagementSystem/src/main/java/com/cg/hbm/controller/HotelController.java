package com.cg.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.entites.Hotel;
import com.cg.hbm.service.IHotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	IHotelService hService;
	
	@PostMapping
	public List<Hotel> addHotel(@RequestBody Hotel hotel) {
		return hService.addHotel(hotel);
	}
	@DeleteMapping("/{id}")
	public List<Hotel> removeHotel(@PathVariable int id) {
		return hService.removeHotel(id);
	}
	@PutMapping
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return hService.updateHotel(hotel);
	}
	@GetMapping
	public List<Hotel>showAllHotels(){
		return hService.showAllHotels();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Hotel>showHotel(@PathVariable int id) {
		Hotel h=hService.showHotel(id);
		if(h!=null) {
			return new ResponseEntity<Hotel>(h,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Hotel>(HttpStatus.NOT_FOUND);
		}
		
	}

}
