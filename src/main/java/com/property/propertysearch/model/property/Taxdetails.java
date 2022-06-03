package com.property.propertysearch.model.property;

import javax.persistence.*;

@Entity
@Table(name = "taxdetails")
public class Taxdetails  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tid;
    private String taxpaid;
    private String escrowaccount;
    private String taxamount;
    private String legaldescription;

//    @OneToOne(mappedBy = "taxdetails")
//    private PropertyDetails propertyDetails;

//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "taxdetails")
//    private PropertyDetails propertyDetails;



    public Taxdetails() {
    }

//    public PropertyDetails getPropertyDetails() {
//        return propertyDetails;
//    }
//
//    public void setPropertyDetails(PropertyDetails propertyDetails) {
//        this.propertyDetails = propertyDetails;
//    }

    public Taxdetails(String escrowaccount, String taxamount, String legaldescription) {
        this.escrowaccount = escrowaccount;
        this.taxamount = taxamount;
        this.legaldescription = legaldescription;
    }

    public String getTaxpaid() {
        return taxpaid;
    }

    public void setTaxpaid(String taxpaid) {
        this.taxpaid = taxpaid;
    }

    public String getEscrowaccount() {
        return escrowaccount;
    }

    public void setEscrowaccount(String escrowaccount) {
        this.escrowaccount = escrowaccount;
    }

    public String getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(String taxamount) {
        this.taxamount = taxamount;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getLegaldescription() {
        return legaldescription;
    }

    public void setLegaldescription(String legaldescription) {
        this.legaldescription = legaldescription;
    }
}
