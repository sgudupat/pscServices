package pscapp.services.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import pscapp.services.manager.ContactsManager;
import pscapp.services.types.ContactInfo;

public class ContactsServiceImpl implements ContactsService {

    private static final Logger logger = Logger.getLogger(ContactsServiceImpl.class.getName());
    @Autowired
    ContactsManager contactsMgr;

    public List<ContactInfo> getContacts(String email, String password) {
        logger.info("Start");
        return contactsMgr.getContacts(email, password);

    }


}
