package hu.polnikadam.szakdolgozat.service;

import hu.polnikadam.szakdolgozat.converter.AddressConverter;
import hu.polnikadam.szakdolgozat.dto.AddressDto;
import hu.polnikadam.szakdolgozat.entitiy.Address;
import hu.polnikadam.szakdolgozat.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	@Autowired
	 AddressConverter addressConverter;
	@Autowired
	 AddressRepository addressRepository;

	public AddressDto addAddress(Address address){
		Address saveAddress = addressRepository.save(address);
		return addressConverter.entityToDto(saveAddress);
	}
	public AddressDto getAddressById(Long id) {
		return addressConverter.entityToDto(addressRepository.findById(id).get());
	}

	public AddressDto updateAddress(Long id, AddressDto addressDto) {
		Address updateAddress = addressRepository.findById(id).get();
		addressConverter.updateEntity(updateAddress,addressDto);
		Address savedAddress = addressRepository.save(updateAddress);
		return addressConverter.entityToDto(savedAddress);
	}
	public Long deleteAddress(Long id) {
		Address address = addressRepository.findById(id).get();
		address.setCountry(null);
		address.setZipCode(null);
		address.setCity(null);
		address.setStreet(null);
		return addressRepository.save(address).getId();
	}
}
