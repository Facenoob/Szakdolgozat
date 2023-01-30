package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.Address;

public interface AddressRepository extends BaseRepository<Address,Long>{
	Address getAddressByName(String username);
}
