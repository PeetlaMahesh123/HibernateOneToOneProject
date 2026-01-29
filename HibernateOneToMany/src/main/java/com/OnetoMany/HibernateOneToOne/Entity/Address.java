package com.OnetoMany.HibernateOneToOne.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addressId;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    // Constructors
    public Address() {}

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Getters & Setters
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
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
}

