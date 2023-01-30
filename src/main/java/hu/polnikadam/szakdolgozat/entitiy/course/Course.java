package hu.polnikadam.szakdolgozat.entitiy.course;

import hu.polnikadam.szakdolgozat.entitiy.AbstractEntity;
import hu.polnikadam.szakdolgozat.entitiy.Person;
import hu.polnikadam.szakdolgozat.entitiy.building.Building;
import hu.polnikadam.szakdolgozat.entitiy.room.Room;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Course extends AbstractEntity {
	@Column
	private String courseName;
	@Column
	private Integer credit;
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person teacher;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "building")
	private Building building;
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;
	@Column
	private LocalDateTime from;
	@Column
	private LocalDateTime to;
	@Column
	private String desctiption;
}
