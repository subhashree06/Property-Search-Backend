package com.property.propertysearch.model.property;

import javax.persistence.*;


@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressid;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;

//    @OneToOne(mappedBy = "address")
//    private PropertyDetails propertyDetails;
//    @OneToOne(mappedBy = "address")
//    private PropertyDetails property;


//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "address")
//    private PropertyDetails propertyDetails;


    public Address(String line1, String line2, String city, String state, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address() {
    }

    public Long getAddressid() {
        return addressid;
    }

    public void setAddressid(Long addressid) {
        this.addressid = addressid;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public PropertyDetails getPropertyDetails() {
//        return propertyDetails;
//    }
//
//    public void setPropertyDetails(PropertyDetails propertyDetails) {
//        this.propertyDetails = propertyDetails;
//    }
}
