package hu.polnikadam.szakdolgozat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressDto {
	private String country;

	private String zipCode;

	private String city;

	private String street;

}
