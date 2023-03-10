package hu.polnikadam.szakdolgozat.entitiy.building;

import hu.polnikadam.szakdolgozat.entitiy.AbstractEntity;
import hu.polnikadam.szakdolgozat.entitiy.Address;
import hu.polnikadam.szakdolgozat.entitiy.room.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Building extends AbstractEntity {
	@Column
	private String name;
	@OneToMany
	private List<Room>rooms;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "address")
	private Address address;

}
