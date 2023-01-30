package hu.polnikadam.szakdolgozat.dto;

import hu.polnikadam.szakdolgozat.entitiy.Person;
import hu.polnikadam.szakdolgozat.entitiy.building.Building;
import hu.polnikadam.szakdolgozat.entitiy.room.Room;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseDto {
	private String courseName;

	private Integer credit;

	private Person teacher;

	private Building building;

	private Room room;

	private LocalDateTime from;

	private LocalDateTime to;

	private String desctiption;
}
