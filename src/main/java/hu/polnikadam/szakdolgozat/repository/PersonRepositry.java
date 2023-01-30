package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositry extends  BaseRepository<Person,Long>{
	Person getPersonByUsername(String username);
}
