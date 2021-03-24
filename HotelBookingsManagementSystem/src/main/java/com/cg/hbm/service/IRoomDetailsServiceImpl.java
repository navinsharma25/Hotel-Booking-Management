package com.cg.hbm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.dao.IRoomDetailsRepository;
import com.cg.hbm.entites.RoomDetails;



@Service
public class IRoomDetailsServiceImpl implements IRoomDetailsService{
	
	@Autowired
	IRoomDetailsRepository rdDao;

	@Override
	public List<RoomDetails> addRoomDetails(RoomDetails roomDetails) {
		rdDao.saveAndFlush(roomDetails);
		return rdDao.findAll();
	}

	@Override
	public List<RoomDetails> updateRoomDetails(RoomDetails roomDetails) {
		rdDao.saveAndFlush(roomDetails);
		return rdDao.findAll();
	}

	@Override
	public List<RoomDetails> removeRoomDetails(int roomDetails_id) {
		rdDao.deleteById(roomDetails_id);
		return rdDao.findAll();
	}

	@Override
	public List<RoomDetails> showAllRoomDetails() {
		return rdDao.findAll();
	}

	@Override
	public RoomDetails showRoomDetails(int roomDetails_id) {
		if(rdDao.findById(roomDetails_id).isPresent()) {
			return rdDao.findById(roomDetails_id).get();
		}
		else {
			return null;
		}
	}

}
