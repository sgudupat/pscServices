package pscapp.services.dao;

import java.util.List;

import pscapp.services.types.ContactInfo;

public interface ContactsDao {

	List<ContactInfo> getContacts(String email, String password);
}
