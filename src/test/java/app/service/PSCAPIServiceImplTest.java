package app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pscapp.services.manager.ContactsManager;

@ContextConfiguration(locations = {"file:src\\main\\webapp\\WEB-INF\\pscServicesContext.xml"})
@Configurable(autowire = Autowire.BY_TYPE)
@RunWith(SpringJUnit4ClassRunner.class)
public class PSCAPIServiceImplTest {
	
	@Autowired
	private ContactsManager contactsManager;

	@Test
	public void testGetContacts() {
		System.out.println("Inside testGetContacts method ");
		System.out.println("hello ");
		System.out.println("hello 12345 ");
		 
		//UserInfoRequest userInfo = new UserInfoRequest();
		//1. Pass UserInfo who have 1 contact
		//2. Pass UserInfo who have more than 1 contact
		//3. Pass UserInfo who do not have any contacts
	/*	ContactInfo contactInfo = apiService.getContacts(userInfo);
		log.info("contactInfo::" + contactInfo.toString());
	*/	
	}
}
