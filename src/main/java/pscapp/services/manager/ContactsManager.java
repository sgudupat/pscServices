package pscapp.services.manager;

import java.util.List;

import pscapp.services.types.ContactInfo;

public interface ContactsManager {
	List<ContactInfo> getContacts(String email, String password);
}
