package hu.polnikadam.szakdolgozat.dto;

import hu.polnikadam.szakdolgozat.entitiy.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoomDto {
	private String roomName;
	private Integer capacity;
	private String roomNumber;
	private Address address;
}
