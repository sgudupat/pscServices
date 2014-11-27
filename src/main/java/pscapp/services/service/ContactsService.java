package pscapp.services.service;

import java.util.List;

import pscapp.services.types.ContactInfo;

public interface ContactsService {
	
	List<ContactInfo> getContacts(String email, String password);

}
