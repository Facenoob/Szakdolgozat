package hu.polnikadam.szakdolgozat.entitiy.room;

import hu.polnikadam.szakdolgozat.entitiy.AbstractEntity;
import hu.polnikadam.szakdolgozat.entitiy.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Room extends AbstractEntity {
	@Column
	private String roomName;
	@Column
	private Integer capacity;
	@Column
	private String roomNumber;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "address")@Column
	private Address address;
}
