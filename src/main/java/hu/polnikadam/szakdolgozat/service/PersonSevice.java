package hu.polnikadam.szakdolgozat.service;

import hu.polnikadam.szakdolgozat.converter.PersonConverter;
import hu.polnikadam.szakdolgozat.dto.PersonDto;
import hu.polnikadam.szakdolgozat.entitiy.Person;
import hu.polnikadam.szakdolgozat.repository.PersonRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonSevice {
	@Autowired
	private PersonRepositry personRepository;
	@Autowired
	private PersonConverter personConverter;

	public PersonDto addPerson(Person person){
		Person savedPerson = personRepository.save(person);
		return personConverter.entityToDto(savedPerson);
	}
	public PersonDto getPersonById(Long id) {
		return personConverter.entityToDto(personRepository.findById(id).get());
	}
	public PersonDto getPersonByUsername(String username) {
		return personConverter.entityToDto(personRepository.getPersonByUsername(username));
	}
	public PersonDto updatePerson(Long id, PersonDto personDto) {
		Person updatePerson = personRepository.findById(id).get();
		personConverter.updateEntity(updatePerson,personDto);
		Person savedPerson = personRepository.save(updatePerson);
		return personConverter.entityToDto(savedPerson);
	}
	public Long deletePerson(Long id) {
		Person person = personRepository.findById(id).get();
		person.setAddress(null);
		return personRepository.save(person).getId();
	}
}
