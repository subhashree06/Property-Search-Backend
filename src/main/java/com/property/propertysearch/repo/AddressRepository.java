package com.property.propertysearch.repo;

import com.property.propertysearch.model.property.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
