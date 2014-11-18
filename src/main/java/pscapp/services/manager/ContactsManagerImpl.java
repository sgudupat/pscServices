package pscapp.services.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pscapp.services.dao.ContactsDao;
import pscapp.services.types.ContactInfo;

public class ContactsManagerImpl implements ContactsManager {
	@Autowired
	private ContactsDao contactDao;

	public List<ContactInfo> getContacts(String email, String password) {
		return contactDao.getContacts(email, password);
	}



}
