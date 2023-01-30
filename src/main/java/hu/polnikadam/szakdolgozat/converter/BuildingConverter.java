package hu.polnikadam.szakdolgozat.converter;

import hu.polnikadam.szakdolgozat.dto.BuildingDto;
import hu.polnikadam.szakdolgozat.entitiy.building.Building;
import org.springframework.stereotype.Component;

@Component
public class BuildingConverter {
	public BuildingDto entityToDto(Building entity){
		BuildingDto buildingDto= new BuildingDto();
		buildingDto.setName(entity.getName());
		buildingDto.setAddress(entity.getAddress());
		buildingDto.setRooms(entity.getRooms());
		return buildingDto;
	}
	public Building dtoToEntity(BuildingDto buildingDto){
		Building building= new Building();
		building.setName(buildingDto.getName());
		building.setAddress(buildingDto.getAddress());
		building.setRooms(buildingDto.getRooms());
		return building;
	}
	public Building updateEntity(Building building,BuildingDto buildingDto){
		building.setName(buildingDto.getName());
		building.setAddress(buildingDto.getAddress());
		building.setRooms(buildingDto.getRooms());
		return building;
	}


}
