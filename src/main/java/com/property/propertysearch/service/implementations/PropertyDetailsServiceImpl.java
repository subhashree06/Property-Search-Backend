package com.property.propertysearch.service.implementations;

import com.property.propertysearch.model.property.PropertyDetails;
import com.property.propertysearch.repo.PropertyDetailsRepository;
import com.property.propertysearch.service.PropertyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PropertyDetailsServiceImpl implements PropertyDetailsService {
    @Autowired
    private PropertyDetailsRepository propertyDetailsRepository;

    @Override
    public PropertyDetails createProperty(PropertyDetails pd) {
        return propertyDetailsRepository.save(pd);
    }

    //@Override
//    public PropertyDetails updatePropertyDetails(PropertyDetails pd) {
//        return propertyDetailsRepository.save(pd);
//    }

    @Override
    public void updatePropertyDetails(PropertyDetails pd){
        propertyDetailsRepository.save(pd);
    }

    @Override
    public PropertyDetails getPropertyDetails(Long pid) {
        Optional<PropertyDetails> optionalPd = propertyDetailsRepository.findById(pid);
        if (optionalPd.isPresent()) {
            return optionalPd.get();
        }
        return null;
    }

    @Override
    public void deletePropertyDetails(Long pid) {
        propertyDetailsRepository.deleteById(pid);
    }

    @Override
    public List<PropertyDetails> getAllPropertyDetails() {
        return propertyDetailsRepository.findAll();
    }

}
