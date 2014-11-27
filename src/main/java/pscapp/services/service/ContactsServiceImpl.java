package pscapp.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pscapp.services.dao.ContactsDao;
import pscapp.services.manager.ContactsManager;
import pscapp.services.types.ContactInfo;

public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
    ContactsManager contactsMgr;
	
	public List<ContactInfo> getContacts(String email, String password) {
			
				return contactsMgr.getContacts(email, password);
			
		}

		
}
