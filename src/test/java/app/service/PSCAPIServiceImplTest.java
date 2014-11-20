package app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration (locations = "classpath*:/spring/applicationContext*.xml")

@RunWith(SpringJUnit4ClassRunner.class)
public class PSCAPIServiceImplTest {

	@Test
	public void testGetContacts() {
		System.out.println("Inside testGetContacts method ");
		//UserInfoRequest userInfo = new UserInfoRequest();
		//1. Pass UserInfo who have 1 contact
		//2. Pass UserInfo who have more than 1 contact
		//3. Pass UserInfo who do not have any contacts
	/*	ContactInfo contactInfo = apiService.getContacts(userInfo);
		log.info("contactInfo::" + contactInfo.toString());
	*/	
	}
}
