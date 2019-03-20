package com.uabc.database.example.examplejpa.entity;

import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "city")
    private String city;

    public Contact(){

    }

    public Contact(String firstName, String lastName, String telephone, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.city = city;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
