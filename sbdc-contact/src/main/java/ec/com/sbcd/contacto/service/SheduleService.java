package ec.com.sbcd.contacto.service;

import ec.com.sbcd.contacto.entity.ContactEntity;
import ec.com.sbcd.contacto.repository.dao.IContactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheduleService implements ISheduleService {

    @Autowired
    IContactDao contactDao;

    @Override
    public void addContact(ContactEntity entity) throws Exception {
        if (contactDao.findContact(entity.getMail()) == null) {
            contactDao.addContact(entity);
            return;
        }
        throw new Exception("Contacto repetido");
    }

    @Override
    public List<ContactEntity> findContacts() {
        return contactDao.findAllContact();
    }

    @Override
    public Boolean updateContact(ContactEntity entity) {
        if (contactDao.findContact(entity.getMail()) != null) {
            contactDao.updateContact(entity);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteContact(Integer id) {
        if (contactDao.findContact(id) != null) {
            contactDao.deleteContact(id);
            return true;
        }
        return false;
    }

    @Override
    public ContactEntity findContact(Integer id) {
        return contactDao.findContact(id);
    }
}
