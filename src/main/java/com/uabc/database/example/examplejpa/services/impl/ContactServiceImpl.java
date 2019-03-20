package com.uabc.database.example.examplejpa.services.impl;


import com.uabc.database.example.examplejpa.components.ContactConverter;
import com.uabc.database.example.examplejpa.entity.Contact;
import com.uabc.database.example.examplejpa.model.ContactModel;
import com.uabc.database.example.examplejpa.respository.ContactRepository;
import com.uabc.database.example.examplejpa.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {

    @Autowired
    @Qualifier("contactRepository")
    private ContactRepository contactRepository;

    @Autowired
    @Qualifier("contactConverter")
    private ContactConverter contactConverter;

    @Override
    public ContactModel addContact(ContactModel contactModel) {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el contactModel a entidad
        Contact temp=contactConverter.convertToContactModel2Contact(contactModel);
        Contact contact = contactRepository.save(temp);
        return contactConverter.convertContact2ContactModel(contact);
    }

    @Override
    public List<ContactModel> listAllContacts() {
        List<Contact> contacts = contactRepository.findAll();
        List<ContactModel> contactsModel = new ArrayList();
        for(Contact contact : contacts){
            contactsModel.add(contactConverter.convertContact2ContactModel(contact));

        }
        return contactsModel;
    }

    @Override
    public Contact findContactById(int id) {
        return contactRepository.findById(id);
    }

    public ContactModel findContactByIdModel(int id){
        return contactConverter.convertContact2ContactModel(findContactById(id));
    }

    @Override
    public void removeContact(int id) {
        Contact contact  = findContactById(id);
        if(contact != null){
            contactRepository.delete(findContactById(id));
        }
    }


}
