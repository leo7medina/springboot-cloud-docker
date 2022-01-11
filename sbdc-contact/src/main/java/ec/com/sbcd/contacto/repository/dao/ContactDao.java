package ec.com.sbcd.contacto.repository.dao;

import ec.com.sbcd.contacto.entity.ContactEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDao implements IContactDao {

    @Autowired
    IContactJPA db;

    @Override
    public void addContact(ContactEntity entity) {

    }

    @Override
    public ContactEntity findContact(String email) {
        return null;
    }

    @Override
    public void deleteContact(String mail) {

    }

    @Override
    public List<ContactEntity> findAllContact() {
        return null;
    }

    @Override
    public void deleteContact(int id) {

    }

    @Override
    public ContactEntity findContact(Integer id) {
        return null;
    }

    @Override
    public void updateContact(ContactEntity entity) {

    }
}
