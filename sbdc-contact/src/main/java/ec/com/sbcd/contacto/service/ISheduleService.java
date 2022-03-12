package ec.com.sbcd.contacto.service;

import ec.com.sbcd.contacto.entity.ContactEntity;

import java.util.List;

public interface ISheduleService {

    void addContact(ContactEntity entity) throws Exception;

    List<ContactEntity> findContacts();

    Boolean updateContact(ContactEntity entity);

    Boolean deleteContact(Integer id);

    ContactEntity findContact(Integer id);

    void exampleAsync();
}
