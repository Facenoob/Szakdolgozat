package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.building.Building;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepositroy extends BaseRepository<Building,Long>{
	Building findByName(String buildingName);
}
