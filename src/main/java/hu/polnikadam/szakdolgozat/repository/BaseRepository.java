package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository <T extends AbstractEntity,ID> extends JpaRepository<T, ID> {
}
