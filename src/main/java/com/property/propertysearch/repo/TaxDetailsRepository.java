package com.property.propertysearch.repo;

import com.property.propertysearch.model.property.Taxdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxDetailsRepository extends JpaRepository<Taxdetails, Long> {
}
