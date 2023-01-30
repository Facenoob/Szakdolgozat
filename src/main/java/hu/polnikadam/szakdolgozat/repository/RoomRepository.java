package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.room.Room;

public interface RoomRepository extends BaseRepository<Room,Long>{
	Room getRoomByroomName(String roomName);
}
