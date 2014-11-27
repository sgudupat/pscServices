package app.services.dao;

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
public class ContactsDaoImplTest {
	
	@Test
	public void testGetContacts() {
		System.out.println("Inside testGetContacts method ");
		System.out.println("hello ");
		
			
	}
}
