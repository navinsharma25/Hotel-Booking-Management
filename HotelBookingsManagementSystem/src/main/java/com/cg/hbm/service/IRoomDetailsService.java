package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entites.RoomDetails;

public interface IRoomDetailsService {
	public List<RoomDetails> addRoomDetails(RoomDetails roomDetails);
	public List<RoomDetails> updateRoomDetails(RoomDetails roomDetails);
	public List<RoomDetails> removeRoomDetails(int roomDetails_id);
	public List<RoomDetails> showAllRoomDetails();
	public RoomDetails showRoomDetails(int roomDetails_id);
}
