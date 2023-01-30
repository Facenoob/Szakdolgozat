package hu.polnikadam.szakdolgozat.converter;

import hu.polnikadam.szakdolgozat.dto.RoomDto;
import hu.polnikadam.szakdolgozat.entitiy.room.Room;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {
	public RoomDto entityToDto(Room room){
		RoomDto roomDto= new RoomDto();
		roomDto.setRoomName(room.getRoomName());
		roomDto.setRoomNumber(room.getRoomNumber());
		roomDto.setCapacity(room.getCapacity());
		roomDto.setAddress(room.getAddress());
		return roomDto;
	}
	public Room dtoToEntity(RoomDto roomDto){
		Room room = new Room();
		room.setRoomName(roomDto.getRoomName());
		room.setRoomNumber(roomDto.getRoomNumber());
		room.setCapacity(room.getCapacity());
		room.setAddress(room.getAddress());
		return room;
	}
	public Room updateEntity(Room room ,RoomDto roomDto){
		room.setRoomName(roomDto.getRoomName());
		room.setRoomNumber(roomDto.getRoomNumber());
		room.setCapacity(room.getCapacity());
		room.setAddress(room.getAddress());
		return room;
	}
}
