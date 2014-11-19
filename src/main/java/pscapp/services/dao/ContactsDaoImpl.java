package pscapp.services.dao;

import java.util.List;

import pscapp.services.types.ContactInfo;

public class ContactsDaoImpl implements ContactsDao {

	public List<ContactInfo> getContacts(String email, String password) {

		if(authenticateUserLogin(email, password)){

		}
		return null;
	}

	private boolean authenticateUserLogin(String email, String password) {
		boolean result = false;
		int count = -1;
		int count2 = -1;
		//removing password from query
		string validEmailPasswordQuery = "SELECT COUNT(*) FROM USERS WHERE email = ?  ";
		String accountActiveQuery = "SELECT COUNT(*) FROM USERS WHERE email = ? AND status = 'ACTIVE' ";
		//QueryParameters params = new QueryParameters();
		//params.addParam(email);
		//params.addParam(password);

		return false;
	}	

}
