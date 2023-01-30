package hu.polnikadam.szakdolgozat.dto;

import hu.polnikadam.szakdolgozat.entitiy.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDto {
	private Long id;
	private String username;

	private String firstName;

	private String lastName;
	private String phone;

	private String email;

	private Address address;
}
