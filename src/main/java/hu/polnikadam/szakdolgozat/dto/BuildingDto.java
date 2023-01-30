package hu.polnikadam.szakdolgozat.dto;

import hu.polnikadam.szakdolgozat.entitiy.Address;
import hu.polnikadam.szakdolgozat.entitiy.room.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BuildingDto {
	private String name;
	private List<Room> rooms;
	private Address address;

}
