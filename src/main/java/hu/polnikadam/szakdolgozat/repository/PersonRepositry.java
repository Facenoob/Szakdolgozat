package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.Person;

public interface PersonRepositry extends  BaseRepository<Person,Long>{
	Person getPersonByUsername(String username);
}
