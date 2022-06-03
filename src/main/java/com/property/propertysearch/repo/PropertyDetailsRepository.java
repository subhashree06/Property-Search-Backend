package com.property.propertysearch.repo;

import com.property.propertysearch.model.property.PropertyDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDetailsRepository extends JpaRepository<PropertyDetails, Long> {
}
