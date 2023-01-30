package hu.polnikadam.szakdolgozat.service;

import hu.polnikadam.szakdolgozat.converter.BuildingConverter;
import hu.polnikadam.szakdolgozat.dto.BuildingDto;
import hu.polnikadam.szakdolgozat.entitiy.building.Building;
import hu.polnikadam.szakdolgozat.repository.BuildingRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {
	@Autowired
	private BuildingRepositroy buildingRepositroy;
	@Autowired
	private BuildingConverter buildingConverter;

	public BuildingDto addBuilding(Building building){
		Building savedBuilding = buildingRepositroy.save(building);
		return buildingConverter.entityToDto(savedBuilding);
	}
	public BuildingDto getBuildingById(Long id){return buildingConverter.entityToDto(buildingRepositroy.findById(id).get());}
	public BuildingDto getBuildingByName(String buildingName){return buildingConverter.entityToDto(buildingRepositroy.findByName(buildingName));}
	public BuildingDto updateBuilding(Long id, BuildingDto buildingDto){
		Building updateBuilding= buildingRepositroy.findById(id).get();
		buildingConverter.updateEntity(updateBuilding,buildingDto);
		Building savedBuilding=buildingRepositroy.save(updateBuilding);
		return buildingConverter.entityToDto(savedBuilding);
	}
	public Long deleteBuilding(Long id){
		Building building = buildingRepositroy.findById(id).get();
		building.setAddress(null);
		return buildingRepositroy.save(building).getId();
	}
}
