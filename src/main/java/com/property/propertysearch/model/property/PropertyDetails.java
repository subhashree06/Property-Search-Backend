package com.property.propertysearch.model.property;


import javax.persistence.*;

@Entity
@Table(name = "propertyDetails")
public class PropertyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    private String firstName;

    private String lastName;
    private String pType;

    //video 1
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "addressid")
//    private Address address;
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "tid")
//    private Taxdetails taxdetails;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "addressid")
    private Address address;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "tid")
    private Taxdetails taxdetails;

    public PropertyDetails()
    {}

    public PropertyDetails(String firstName, String lastName, String pType, Address address, Taxdetails taxdetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pType = pType;
        this.address = address;
        this.taxdetails = taxdetails;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Taxdetails getTaxdetails() {
        return taxdetails;
    }

    public void setTaxdetails(Taxdetails taxdetails) {
        this.taxdetails = taxdetails;
    }
}
