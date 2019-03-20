package com.uabc.database.example.examplejpa.respository;

import com.uabc.database.example.examplejpa.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("contactRepository")
public interface ContactRepository extends JpaRepository<Contact, Serializable> {
    public abstract Contact findById(int id);
}
