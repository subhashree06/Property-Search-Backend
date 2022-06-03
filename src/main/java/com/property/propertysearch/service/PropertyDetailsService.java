package com.property.propertysearch.service;

import com.property.propertysearch.model.property.PropertyDetails;

import java.util.List;

public interface PropertyDetailsService {
    public PropertyDetails createProperty(PropertyDetails pd);
    public void updatePropertyDetails(PropertyDetails pd);
    public PropertyDetails getPropertyDetails(Long pid);
    public void deletePropertyDetails(Long pid);
    public List<PropertyDetails> getAllPropertyDetails();
}
