package com.property.propertysearch.controller;

import com.property.propertysearch.model.property.PropertyDetails;
import com.property.propertysearch.repo.PropertyDetailsRepository;
import com.property.propertysearch.service.PropertyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class PropertyDetailsController {
    @Autowired
    private PropertyDetailsService propertyDetailsService;
    @PostMapping(consumes = "application/json", produces = "application/json", path = "/property")
    public ResponseEntity<PropertyDetails> createProperty(@RequestBody PropertyDetails pd) {
        return new ResponseEntity<>(propertyDetailsService.createProperty(pd), HttpStatus.CREATED);
    }
    @PutMapping(consumes = "application/json", produces = "application/json", path = "/property/{pid}")
    public void updatePropertyDetails(@PathVariable("pid") Long pid ,@RequestBody PropertyDetails pd) {
        propertyDetailsService.updatePropertyDetails(pd);
    }
    @DeleteMapping(produces = "application/json", path = "/property/{pid}")
    public void deletePropertyDetails(@PathVariable(value = "pid") Long pid) {
        propertyDetailsService.deletePropertyDetails(pid);
        //return new ResponseEntity<>("Property with propertyId : " + pid + " deleted successfully", HttpStatus.OK);
    }
    @GetMapping(path = "/property/{pid}", produces = "application/json")
    public ResponseEntity<PropertyDetails> getPropertyDetails(@PathVariable(value = "pid") Long pid) {
        return new ResponseEntity<>(propertyDetailsService.getPropertyDetails(pid), HttpStatus.OK);
    }
    @GetMapping(path = "/properties", produces = "application/json")
    public ResponseEntity<List<PropertyDetails>> getAllPropertyDetails    () {
        return new ResponseEntity<>(propertyDetailsService.getAllPropertyDetails(), HttpStatus.OK);
    }

}
