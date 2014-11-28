package pscapp.services.manager;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import pscapp.services.dao.ContactsDao;
import pscapp.services.types.ContactInfo;

public class ContactsManagerImpl implements ContactsManager {
	@Autowired
	private ContactsDao contactDao;

    private static final Logger logger = Logger.getLogger(ContactsManagerImpl.class.getName());

    public List<ContactInfo> getContacts(String email, String password) {
        logger.info("Start");
        if(contactDao.authenticateUserLogin(email, password)){
		        return contactDao.getContacts(email, password);
			}
			return null;
	}

}
