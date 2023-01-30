package hu.polnikadam.szakdolgozat.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address extends AbstractEntity{
	@Column
	private String country;
	@Column
	private String zipCode;
	@Column
	private String city;
	@Column
	private String street;

	@Override
	public String toString() {
		return country+" "+zipCode+" "+city+" "+street;
	}
}
