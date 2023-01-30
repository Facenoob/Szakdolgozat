package hu.polnikadam.szakdolgozat.converter;

import hu.polnikadam.szakdolgozat.dto.PersonDto;
import hu.polnikadam.szakdolgozat.entitiy.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonConverter {
	public PersonDto entityToDto(Person entity){
		PersonDto personDto= new PersonDto();
		personDto.setId(entity.getId());
		personDto.setUsername(entity.getUsername());
		personDto.setFirstName(entity.getFirstName());
		personDto.setLastName(entity.getLastName());
		personDto.setPhone(entity.getPhone());
		personDto.setEmail(entity.getEmail());
		personDto.setAddress(entity.getAddress());
		return personDto;
	}
	public Person entityToDto(PersonDto personDto){
		Person person= new Person();
		person.setUsername(personDto.getUsername());
		person.setFirstName(personDto.getFirstName());
		person.setLastName(personDto.getLastName());
		person.setPhone(personDto.getPhone());
		person.setEmail(personDto.getEmail());
		person.setAddress(personDto.getAddress());
		return person;
	}
	public Person updateEntity(Person person,PersonDto personDto){
		person.setUsername(personDto.getUsername());
		person.setFirstName(personDto.getFirstName());
		person.setLastName(personDto.getLastName());
		person.setPhone(personDto.getPhone());
		person.setEmail(personDto.getEmail());
		return person;
	}
}
