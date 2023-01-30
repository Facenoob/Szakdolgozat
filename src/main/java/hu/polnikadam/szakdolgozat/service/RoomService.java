package hu.polnikadam.szakdolgozat.service;

import hu.polnikadam.szakdolgozat.converter.RoomConverter;
import hu.polnikadam.szakdolgozat.dto.RoomDto;
import hu.polnikadam.szakdolgozat.entitiy.room.Room;
import hu.polnikadam.szakdolgozat.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private RoomConverter roomConverter;

	public RoomDto addRoom(Room room){
		Room savedRoom = roomRepository.save(room);
		return roomConverter.entityToDto(savedRoom);
	}
	public RoomDto getRoomById(Long id) {
		return roomConverter.entityToDto(roomRepository.findById(id).get());
	}
	public RoomDto getRoomByUsername(String roomName) {
		return roomConverter.entityToDto(roomRepository.getRoomByroomName(roomName));
	}
	public RoomDto updateRoom(Long id, RoomDto roomDto) {
		Room updateRoom = roomRepository.findById(id).get();
		roomConverter.updateEntity(updateRoom,roomDto);
		Room savedRoom = roomRepository.save(updateRoom);
		return roomConverter.entityToDto(savedRoom);
	}
	public Long deleteRoom(Long id) {
		Room room = roomRepository.findById(id).get();
		room.setAddress(null);
		return roomRepository.save(room).getId();
	}
}

