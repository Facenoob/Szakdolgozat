package hu.polnikadam.szakdolgozat.converter;

import hu.polnikadam.szakdolgozat.dto.AddressDto;
import hu.polnikadam.szakdolgozat.entitiy.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter {
	public AddressDto entityToDto(Address address){
		AddressDto addressDto= new AddressDto();
		addressDto.setCountry(address.getCountry());
		addressDto.setZipCode(address.getZipCode());
		addressDto.setCity(address.getCity());
		addressDto.setStreet(address.getStreet());
		return addressDto;
	}
	public Address dtoToEntity(AddressDto addressDto){
		Address address= new Address();
		address.setCountry(addressDto.getCountry());
		address.setZipCode(addressDto.getZipCode());
		address.setCity(addressDto.getCity());
		address.setStreet(addressDto.getStreet());
		return address;
	}
	public Address updateEntity(Address address,AddressDto addressDto){
		address.setCountry(addressDto.getCountry());
		address.setZipCode(addressDto.getZipCode());
		address.setCity(addressDto.getCity());
		address.setStreet(addressDto.getStreet());
		return address;
	}
}
